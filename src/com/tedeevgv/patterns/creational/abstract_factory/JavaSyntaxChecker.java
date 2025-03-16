package com.tedeevgv.patterns.creational.abstract_factory;

public class JavaSyntaxChecker implements SyntaxChecker {
    @Override
    public boolean check(String code) {
        return "java code".equals(code);
    }
}
