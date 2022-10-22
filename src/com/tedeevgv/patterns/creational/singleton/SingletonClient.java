package com.tedeevgv.patterns.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext context = ApplicationContext.getInstance();
        ApplicationContext contextFakeDuplicate = ApplicationContext.getInstance();
        System.out.println("Are this two object equal: " + (context == contextFakeDuplicate));
    }
}
