package com.tedeevgv.patterns.behavioral.mediator;

public class UserColleagueImpl extends UserColleague {

    public UserColleagueImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
        chatMediator.addUser(this);
    }

    @Override
    void send(String message) {
        System.out.printf(this.name + " sent message '%s' to chat\n", message);
        chatMediator.sendMessage(this.name, message);
    }

    @Override
    void receive(String message, String senderName) {
        System.out.printf(this.name + " received message '%s' from %s\n", message, senderName);
    }
}
