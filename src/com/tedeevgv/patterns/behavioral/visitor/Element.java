package com.tedeevgv.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
