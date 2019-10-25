package com.nttr007.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    @Autowired
    CacheManager cacheManager;

    public void add (Person person){
           cacheManager.getCache("").put(new Integer(person.getId()),person); 
    }
    public Person get (final int  id ){
        return (Person)cacheManager.getCache("").get(new Integer(id));

    }

}