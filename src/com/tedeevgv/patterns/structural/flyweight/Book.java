package com.tedeevgv.patterns.structural.flyweight;

public class Book {
    private final BookMeta meta;
    private Long ownerId;

    public Book(BookMeta meta) {
        this.meta = meta;
    }

    void borrow(Long userId) {
        this.ownerId = userId;
    }

    public String description() {
        return meta + ". Owner userId is: " + ownerId;
    }
}
