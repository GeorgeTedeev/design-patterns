package com.tedeevgv.patterns.structural.bridge;

import com.tedeevgv.patterns.structural.bridge.help_stuff.Task;

public class I7 implements Processor {
    @Override
    public void process(Task task) {
        System.out.println("I7 is processing!");
        task.doTask();
    }
}
