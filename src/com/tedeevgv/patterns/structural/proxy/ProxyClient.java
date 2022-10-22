package com.tedeevgv.patterns.structural.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Dao daoImpl = new DaoImpl();
        Dao daoProxy = new DaoProxy(daoImpl);
        daoProxy.saveInfo("we created proxy!");
    }
}
