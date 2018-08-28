package cn.springcloud.book.dao;

import cn.springcloud.book.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caibosi on 2018-07-27.
 */
public interface InventoryDao extends JpaRepository<Inventory, Integer> {
    Inventory findByProductCode(String productCode);
}
