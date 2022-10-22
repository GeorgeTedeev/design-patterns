package com.tedeevgv.patterns.structural.bridge;

import com.tedeevgv.patterns.structural.bridge.help_stuff.Charger;
import com.tedeevgv.patterns.structural.bridge.help_stuff.Task;

public abstract class Laptop {
    protected final Processor processor;

    protected Laptop(Processor processor) {
        this.processor = processor;
    }


    abstract void doCalculation(Task task);

    public void charge(Charger charger) {
        charger.doCharging();
    }
}
