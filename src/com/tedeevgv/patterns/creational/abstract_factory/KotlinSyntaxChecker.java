package com.tedeevgv.patterns.creational.abstract_factory;

public class KotlinSyntaxChecker implements SyntaxChecker {
    @Override
    public boolean check(String code) {
        return "kotlin code".equals(code);
    }
}
