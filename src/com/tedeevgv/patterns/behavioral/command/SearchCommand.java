package com.tedeevgv.patterns.behavioral.command;

public class SearchCommand {
    private final SearchEngine searchEngine;
    private final String searchQuery;

    public SearchCommand(SearchEngine searchEngine, String searchQuery) {
        this.searchEngine = searchEngine;
        this.searchQuery = searchQuery;
    }

    public final String execute() {
        return searchEngine.search(searchQuery);
    }

    public final String searchInfo(){
        return "Search query: '" + searchQuery + "' in following search engine: '" + searchEngine.getName() + "'";
    }
}
