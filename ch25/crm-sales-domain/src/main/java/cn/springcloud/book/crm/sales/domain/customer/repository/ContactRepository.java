package cn.springcloud.book.crm.sales.domain.customer.repository;

import cn.springcloud.book.crm.sales.domain.customer.entity.ContactE;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.repository.RepositoryI;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class ContactRepository implements RepositoryI {

	public Set<ContactE> queryContactByGlobalId(String globalId, String type){
		HaloContext.getExtBizCode();
		HaloContext.getBizCode();
		return null;
	}

}
