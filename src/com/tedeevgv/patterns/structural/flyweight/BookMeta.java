package com.tedeevgv.patterns.structural.flyweight;

import java.util.Objects;

public class BookMeta {
    private final String author;
    private final String title;

    public BookMeta(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookMeta bookMeta = (BookMeta) o;
        return Objects.equals(author, bookMeta.author) && Objects.equals(title, bookMeta.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
