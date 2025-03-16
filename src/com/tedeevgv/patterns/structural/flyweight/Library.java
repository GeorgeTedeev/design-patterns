package com.tedeevgv.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, BookMeta> bookByMeta = new HashMap<>();

    public Book getBook(String author, String title) {
        var bookMeta = bookByMeta.computeIfAbsent(author + title, k -> new BookMeta(author, title));
        return new Book(bookMeta);
    }

    //just for test info
    public Integer bookMetaCacheSize() {
        return bookByMeta.size();
    }
}
