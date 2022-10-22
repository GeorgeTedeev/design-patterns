package com.tedeevgv.patterns.behavioral.observer;

public abstract class YouTubeChannel {
    protected final String name;

    protected YouTubeChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void addVideo();
}
