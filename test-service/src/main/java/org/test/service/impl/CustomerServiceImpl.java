package org.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.base.BaseDao;
import org.test.entity.Customer;
import org.test.service.CustomerService;
import org.test.service.base.impl.BaseServiceImpl;

@Service("customerService")  
@Transactional  
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements CustomerService {  
  
    /** 
     * 注入DAO 
     */  
    @Resource(name = "customerDao")  
    public void setDao(BaseDao<Customer> dao) {  
        super.setDao(dao);  
    }  
  
    /** 
     * 若CustomerService 定义了BaseService没有的方法，则可以在这里实现 
     */  
  
}  
