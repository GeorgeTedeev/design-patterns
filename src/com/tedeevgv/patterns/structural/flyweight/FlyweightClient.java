package com.tedeevgv.patterns.structural.flyweight;

public class FlyweightClient {
    public static void main(String[] args) {
        var library = new Library();

        var albert = library.getBook("Tolstoy", "Albert");
        albert.borrow(1L);

        var anotherAlbert = library.getBook("Tolstoy", "Albert");
        anotherAlbert.borrow(2L);

        System.out.println(albert.description());
        System.out.println(anotherAlbert.description());
        System.out.println("Cache size: " + library.bookMetaCacheSize());
    }
}
