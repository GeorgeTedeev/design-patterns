package com.tedeevgv.patterns.structural.proxy;

public class DaoImpl implements Dao {
    @Override
    public void saveInfo(String info) {
        System.out.printf("Info: \"%s\", was saved%n", info);
    }
}
