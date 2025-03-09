package com.tedeevgv.patterns.behavioral.observer;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class YouTubeChannel implements Publisher<YouTubeUser> {
    private final String name;
    private final Set<YouTubeUser> subscribers = ConcurrentHashMap.newKeySet();

    protected YouTubeChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addVideo() {
        notifySubscribers();
    }

    @Override
    public void register(YouTubeUser subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(YouTubeUser subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(this.getName()));
    }
}
