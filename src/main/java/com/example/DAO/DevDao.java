package com.example.DAO;

import com.example.IEntityDao;
import com.example.entity.Developer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class DevDao implements IEntityDao<Developer> {

    @Autowired
    private BeanFactory beanFactory;

    @Override
    @PostConstruct
    public void init(){
        Developer developer = beanFactory.getBean(Developer.class, "John", "Programmer", 89999);
    }

    private Map<Integer, Developer> map = new HashMap<>();

    @Override
    public void save(Developer entity){
        map.put(entity.getId(), entity);
    }

    @Override
    public Developer findOne(Integer id){
        return map.get(id);
    }

}
