package com.tedeevgv.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {

    private final Map<String, UserColleague> users = new HashMap<>();

    @Override
    public void sendMessage(String senderName, String message) {
        users.entrySet().stream()
                .filter(user -> !user.getKey().equals(senderName))
                .forEach(user -> user.getValue().receive(message, senderName));
    }

    @Override
    public void addUser(UserColleague user) {
        users.put(user.name, user);
    }
}
