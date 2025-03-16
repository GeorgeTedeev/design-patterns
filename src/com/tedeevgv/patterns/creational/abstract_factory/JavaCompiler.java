package com.tedeevgv.patterns.creational.abstract_factory;

public class JavaCompiler implements Compiler {
    @Override
    public void compile(String code) {
        System.out.println("Compiled java code");
    }
}
