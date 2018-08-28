package cn.springcloud.book.service;

import cn.springcloud.book.dao.InventoryDao;
import cn.springcloud.book.domain.Inventory;
import cn.springcloud.book.dto.OrderRequest;
import org.apache.servicecomb.saga.omega.context.OmegaContext;
import org.apache.servicecomb.saga.omega.transaction.annotations.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by caibosi on 2018-07-29.
 */
@Service
public class InventoryService {

    private Set<String> executedSet = new ConcurrentHashMap<>().newKeySet();

    private Set<String> canceledSet = new ConcurrentHashMap<>().newKeySet();

    @Autowired
    InventoryDao inventoryDao;


    @Compensable(timeout = 1, compensationMethod = "cancel")
    @Transactional
    public Inventory order(OrderRequest orderRequest){
        if(executedSet.contains(orderRequest.getTxId()) || canceledSet.contains(orderRequest.getTxId())){
            return inventoryDao.findByProductCode(orderRequest.getProductCode());
        }
        try {
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Inventory inventory = inventoryDao.findByProductCode(orderRequest.getProductCode());
        if(inventory == null){
            throw new IllegalStateException("product not found");
        }
        if(inventory.getLeftNum() < orderRequest.getQuantity()){
            throw new IllegalStateException("not enough product left");
        }
        inventory.setLeftNum(inventory.getLeftNum() - orderRequest.getQuantity());
        Inventory result = inventoryDao.save(inventory);
        executedSet.add(orderRequest.getTxId());
        return result;
    }

    @Transactional
    public Inventory cancel(OrderRequest orderRequest){
//        orderRequest.getTxId().substring(1,100);
        if(canceledSet.contains(orderRequest.getTxId()) || !executedSet.contains(orderRequest.getTxId())){
            return inventoryDao.findByProductCode(orderRequest.getProductCode());
        }
        Inventory inventory = inventoryDao.findByProductCode(orderRequest.getProductCode());
        if(inventory == null){
            throw new IllegalStateException("product not found");
        }
        inventory.setLeftNum(inventory.getLeftNum() + orderRequest.getQuantity());
        Inventory result = inventoryDao.save(inventory);
        canceledSet.add(orderRequest.getTxId());
        return result;
    }
}
