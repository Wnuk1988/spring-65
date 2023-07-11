package com.tms.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component(value = "employee-bean") // дает спрингу право вычитывать класс
public class Employee {
   // @Autowired
    private HRManager hrManager;
    private  String name;
    private Integer id;
    private Integer age;

    @PostConstruct
    public void init(){
        System.out.println("Init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method");
    }
    // @Autowired
    public Employee(HRManager hrManager) {
        this.hrManager = hrManager;
    }

    public HRManager getHrManager() {
        return hrManager;
    }
    @Autowired
    public void setHrManager(HRManager hrManager) {
        this.hrManager = hrManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
