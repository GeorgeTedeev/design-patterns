package com.tedeevgv.patterns.structural.bridge;

import com.tedeevgv.patterns.structural.bridge.help_stuff.Task;

public class M1 implements Processor {
    @Override
    public void process(Task task) {
        System.out.println("M1 is processing!");
        task.doTask();
    }
}
