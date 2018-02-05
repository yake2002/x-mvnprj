package org.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.base.BaseDao;
import org.test.entity.Order;
import org.test.service.OrderService;
import org.test.service.base.impl.BaseServiceImpl;

@Service(value = "orderService")  
@Transactional  
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {  
  
    /** 
     * 注入DAO 
     */  
    @Resource(name = "orderDao")  
    public void setDao(BaseDao<Order> dao) {  
        super.setDao(dao);  
    }  
  
    /** 
     * 若CustomerService 定义了BaseService没有的方法，则可以在这里实现 
     */  
} 