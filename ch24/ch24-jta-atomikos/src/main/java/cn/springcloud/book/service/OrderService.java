package cn.springcloud.book.service;

import cn.springcloud.book.dao.log.EventLogDao;
import cn.springcloud.book.dao.order.UserOrderDao;
import cn.springcloud.book.domain.log.EventLog;
import cn.springcloud.book.domain.order.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by caibosi on 2018-07-25.
 */
@Component
public class OrderService {

    @Autowired
    UserOrderDao userOrderDao;

    @Autowired
    EventLogDao eventLogDao;

    @Transactional
    public void newOrder(String userId,String productCode,int quantity){
        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(userId);
        userOrder.setProductCode(productCode);
        userOrder.setQuantity(quantity);
        userOrderDao.save(userOrder);

        EventLog eventLog = new EventLog();
        eventLog.setOperation("new order");
        eventLog.setOperator(userId);
        eventLogDao.save(eventLog);
    }

    @Transactional
    public void newOrderRollback(String userId,String productCode,int quantity){
        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(userId);
        userOrder.setProductCode(productCode);
        userOrder.setQuantity(quantity);
        userOrderDao.save(userOrder);

        EventLog eventLog = new EventLog();
        eventLog.setOperation("new order");
        eventLog.setOperator(userId);
        eventLogDao.save(eventLog);

        throw new RuntimeException("test jta rollback");
    }
}
