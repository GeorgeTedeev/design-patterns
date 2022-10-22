package com.tedeevgv.patterns.behavioral.observer;

public interface Subscriber {
    void update(String publisherName);
    void subscribe(Publisher publisher);
    void unSubscribe(Publisher publisher);
}
