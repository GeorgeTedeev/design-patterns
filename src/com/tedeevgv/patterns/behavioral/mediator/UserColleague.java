package com.tedeevgv.patterns.behavioral.mediator;

public abstract class UserColleague {
    protected ChatMediator chatMediator;
    protected String name;

    public UserColleague(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message, String senderName);
}
