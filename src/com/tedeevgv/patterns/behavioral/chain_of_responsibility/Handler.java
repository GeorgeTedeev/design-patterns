package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public interface Handler {
    void setNextHandler(Handler handler);
    void process(File file);
}
