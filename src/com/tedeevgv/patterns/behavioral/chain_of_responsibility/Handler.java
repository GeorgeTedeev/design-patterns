package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public final void setNextHandler(Handler handler) {
        this.next = handler;
    }

    abstract void process(File file);

    protected final void forward(File file) {
        if (this.next == null) {
            System.out.printf("File's type: %s is not supported!%n", file.getType());
        } else {
            next.process(file);
        }
    }
}
