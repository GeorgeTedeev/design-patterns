package com.tedeevgv.patterns.structural.proxy;

public class DaoProxy implements Dao {
    private Dao daoImpl;

    public DaoProxy(Dao daoImpl) {
        this.daoImpl = daoImpl;
    }

    @Override
    public void saveInfo(String info) {
        System.out.println("Start transaction");
        daoImpl.saveInfo(info);
        System.out.println("Close transaction");
    }
}
