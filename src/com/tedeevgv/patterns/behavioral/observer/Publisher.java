package com.tedeevgv.patterns.behavioral.observer;

public interface Publisher<T extends Subscriber> {
    void register(T subscriber);
    void remove(T subscriber);
    void notifySubscribers();
}
