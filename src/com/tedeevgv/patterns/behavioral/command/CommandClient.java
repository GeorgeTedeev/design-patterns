package com.tedeevgv.patterns.behavioral.command;

public class CommandClient {
    public static void main(String[] args) {
        var browser = new Browser();

        browser.search(new EnglishSearchCommand("some search query"));
        browser.search(new RussianSearchCommand("некоторый поисковой зарос"));

        System.out.println("Following search history:\n" + browser.getHistoryInfo());
    }

}
