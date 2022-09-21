package com.example.homework02.entity;

import org.springframework.beans.factory.FactoryBean;

public class DellDisplayerFactoryBean implements FactoryBean<DellDisplayer> {
    @Override
    public DellDisplayer getObject() throws Exception {
        System.out.println("DellDisplayerFactoryBean create object...");
        return DellDisplayer.getInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return DellDisplayer.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
