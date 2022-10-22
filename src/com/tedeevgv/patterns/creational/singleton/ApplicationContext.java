package com.tedeevgv.patterns.creational.singleton;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class ApplicationContext {

    private static ApplicationContext instance;

    private ApplicationContext() throws IllegalAccessException {
        if(nonNull(instance)) throw new IllegalAccessException();
    }

    public static ApplicationContext getInstance() throws IllegalAccessException {
        if(isNull(instance)) {
            instance = new ApplicationContext();
        }
        return instance;
    }

    public void getBean(String beanName) {
        System.out.println(beanName + " is returned by application ctx");
    }

}
