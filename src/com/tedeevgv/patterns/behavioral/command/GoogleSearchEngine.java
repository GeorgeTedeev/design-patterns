package com.tedeevgv.patterns.behavioral.command;

public class GoogleSearchEngine implements SearchEngine {
    @Override
    public String search(String searchQuery) {
        return "info found by google :)";
    }

    @Override
    public String getName() {
        return "Google";
    }
}
