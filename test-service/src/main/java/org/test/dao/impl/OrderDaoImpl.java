package org.test.dao.impl;

import org.springframework.stereotype.Repository;
import org.test.dao.OrderDao;
import org.test.dao.base.impl.BaseDaoImpl;
import org.test.entity.Order;

@Repository(value = "orderDao")  
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {  
  
    /** 
     * 若OrderDao 定义了BaseDAO没有的方法，则可以在这里实现 
     */  
}  
