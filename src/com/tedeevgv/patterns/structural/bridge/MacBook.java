package com.tedeevgv.patterns.structural.bridge;

import com.tedeevgv.patterns.structural.bridge.help_stuff.Task;

public class MacBook extends Laptop {

    public MacBook(Processor processor) {
        super(processor);
    }

    @Override
    void doCalculation(Task task) {
        processor.process(task);
    }
}
