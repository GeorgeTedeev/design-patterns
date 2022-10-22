package com.tedeevgv.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class CoolYouTubeChannel extends YouTubeChannel implements Publisher {

    private final Set<Subscriber> subscribers = new HashSet<>();

    public CoolYouTubeChannel(String name) {
        super(name);
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(this.getName()));
    }

    @Override
    public void addVideo() {
        notifySubscribers();
    }
}
