package cn.springcloud.book.crm.sales.dao;

import org.apache.ibatis.annotations.Param;
import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;

import java.util.List;

public interface CustomerDOMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(CustomerDO record);

    int insertSelective(CustomerDO record);

    CustomerDO selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(CustomerDO record);

    int updateByPrimaryKey(CustomerDO record);

    List<CustomerDO> selectByParams(@Param("customerId")String customerId ,@Param("memberId")String memberId, @Param("offset") long offset,@Param("limit") long limit);

    int countByParams(@Param("customerId")String customerId ,@Param("memberId")String memberId);
}