package com.tedeevgv.patterns.behavioral.observer;

public class CoolYouTubeUser extends YouTubeUser implements Subscriber {

    public CoolYouTubeUser(String login) {
        super(login);
    }

    @Override
    public void update(String publisherName) {
        System.out.printf("There is new video on '%s' channel for user '%s'%n", publisherName, getLogin());
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.registerSubscriber(this);
    }

    @Override
    public void unSubscribe(Publisher publisher) {
        publisher.removeSubscriber(this);
    }

}
