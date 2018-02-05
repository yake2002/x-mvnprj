package org.test.dao.base;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.type.Type;

public class IdGenerator implements Configurable,IdentifierGenerator {  
	  
	  
    public String dataCenterID;  
    public String idLength;  
  
  
    public void configure(Type type, Properties params, Dialect d) {  
        this.dataCenterID = params.getProperty("dataCenterID");  
        this.idLength = params.getProperty("idLength");  
    }  
  
  
    public Serializable generate(SessionImplementor session, Object obj) {  
        return dataCenterID + idLength;  
    }  
  
  
} 
