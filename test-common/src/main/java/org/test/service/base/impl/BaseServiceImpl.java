package org.test.service.base.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.test.dao.base.BaseDao;
import org.test.service.base.BaseService;

@Transactional  
public class BaseServiceImpl<T> implements BaseService<T> {  
      
    /** 
     * 注入BaseDao 
     */  
    private BaseDao<T> dao;  
    @Resource  
    public void setDao(BaseDao<T> dao) {  
        this.dao = dao;  
    }  
  
    public void save(T entity) {  
        dao.save(entity);  
    }  
  
    public void update(T entity) {  
        dao.update(entity);  
    }  
  
    public void delete(Serializable id) {  
        dao.delete(id);  
    }  
  
    public T getById(Serializable id) {  
        return dao.findById(id);  
    }  
  
    public List<T> getByHQL(String hql, Object... params) {  
        return dao.findByHQL(hql, params);  
    }  
} 
