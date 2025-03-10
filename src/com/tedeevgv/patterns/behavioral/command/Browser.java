package com.tedeevgv.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    private final List<SearchCommand> searchHistory = new ArrayList<>();

    public String search(SearchCommand command) {
        searchHistory.add(command);
        return command.execute();
    }

    public String getHistoryInfo() {
        return searchHistory.stream().map(SearchCommand::searchInfo).reduce("", (a, b) -> a + b + "\n");
    }
}
