package cn.springcloud.book.service;

import cn.springcloud.book.dao.FrozeRequestDao;
import cn.springcloud.book.dao.InventoryDao;
import cn.springcloud.book.domain.FrozeRequest;
import cn.springcloud.book.domain.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by caibosi on 2018-07-27.
 */
@Component
public class FrozeService {

    @Autowired
    InventoryDao inventoryDao;

    @Autowired
    FrozeRequestDao frozeRequestDao;

    @Transactional
    public void confirm(FrozeRequest request, Inventory inventory) {
        frozeRequestDao.delete(request);
        int left = inventory.getLeftNum() - request.getFrozenNum();
        if (left < 0) {
            throw new IllegalStateException("inventory left < 0");
        }
        inventory.setLeftNum(left);
        inventoryDao.save(inventory);
    }

    @Transactional
    public void cancel(FrozeRequest request) {
        frozeRequestDao.delete(request);
    }
}
