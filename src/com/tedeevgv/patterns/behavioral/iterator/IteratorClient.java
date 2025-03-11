package com.tedeevgv.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratorClient {
    public static void main(String[] args) {
        // without creating custom example, just using jdk example with ArrayList and LinkedList
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        iterate(list);

        list = new LinkedList<>();
        list.add("d");
        list.add("e");
        list.add("f");
        iterate(list);
    }

    private static <T> void iterate(Iterable<T> iterable) {
        var iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
