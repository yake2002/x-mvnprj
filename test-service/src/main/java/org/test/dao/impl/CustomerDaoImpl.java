package org.test.dao.impl;

import org.springframework.stereotype.Repository;
import org.test.dao.CustomerDao;
import org.test.dao.base.impl.BaseDaoImpl;
import org.test.entity.Customer;

@Repository(value = "customerDao")  
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {  
  
    /** 
     * 若CustomerDao 定义了BaseDAO没有的方法，则可以在这里实现 
     */  
}  
