package cn.springcloud.book.dao;

import cn.springcloud.book.domain.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caibosi on 2018-07-27.
 */
public interface OrderDao extends JpaRepository<UserOrder, Integer> {
    UserOrder findByTxId(String txId);
}
