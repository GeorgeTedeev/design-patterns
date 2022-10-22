package com.tedeevgv.patterns.behavioral.observer;

public abstract class YouTubeUser {
    protected final String login;

    protected YouTubeUser(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
