package com.tedeevgv.patterns.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String senderName, String message);

    void addUser(UserColleague user);
}
