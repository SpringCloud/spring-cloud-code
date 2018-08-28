package cn.springcloud.book.crm.sales.dto;

import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.dto.Command;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private CustomerCO customer;
    
}
