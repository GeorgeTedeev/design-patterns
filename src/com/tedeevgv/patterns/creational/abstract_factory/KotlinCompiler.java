package com.tedeevgv.patterns.creational.abstract_factory;

public class KotlinCompiler implements Compiler {
    @Override
    public void compile(String code) {
        System.out.println("Compiled kotlin code");
    }
}
