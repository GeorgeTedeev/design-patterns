package com.tedeevgv.patterns.structural.bridge;

import com.tedeevgv.patterns.structural.bridge.help_stuff.Task;

public class BridgeClient {
    public static void main(String[] args) {
        Processor m1 = new M1();
        Processor i7 = new I7();
        Laptop macbookM1 = new MacBook(m1);
        Laptop macbookI7 = new MacBook(i7);
        Task task = () -> System.out.println("some task");
        macbookM1.doCalculation(task);
        macbookI7.doCalculation(task);
    }
}
