package com.tedeevgv.patterns.behavioral.mediator;

public class MediatorClient {
    public static void main(String[] args) {
        ChatMediator chat = new ChatMediatorImpl();
        UserColleague sasha = new UserColleagueImpl(chat, "Sasha");
        UserColleague dasha = new UserColleagueImpl(chat, "Dasha");
        UserColleague nyusha = new UserColleagueImpl(chat, "Nyusha");
        sasha.send("Hello");
    }
}
