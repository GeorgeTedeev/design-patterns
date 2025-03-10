package com.tedeevgv.patterns.behavioral.command;

public class EnglishSearchCommand extends SearchCommand {
    public EnglishSearchCommand(String searchQuery) {
        super(new GoogleSearchEngine(), searchQuery);
    }
}
