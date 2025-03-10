package com.tedeevgv.patterns.behavioral.command;

public class YandexSearchEngine implements SearchEngine {
    @Override
    public String search(String searchQuery) {
        return "info found by yandex :)";
    }

    @Override
    public String getName() {
        return "Yandex";
    }
}
