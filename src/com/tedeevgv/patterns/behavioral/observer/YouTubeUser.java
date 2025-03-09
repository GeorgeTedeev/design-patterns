package com.tedeevgv.patterns.behavioral.observer;

public class YouTubeUser implements Subscriber {
    protected final String login;

    protected YouTubeUser(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public void update(String publisherName) {
        System.out.printf("There is new video on '%s' channel for user '%s'%n", publisherName, getLogin());
    }
}
