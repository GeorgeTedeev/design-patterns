package com.tedeevgv.patterns.behavioral.command;

public class RussianSearchCommand extends SearchCommand {
    public RussianSearchCommand(String searchQuery) {
        super(new YandexSearchEngine(), searchQuery);
    }
}
