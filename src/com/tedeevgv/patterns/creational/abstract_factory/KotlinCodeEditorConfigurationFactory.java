package com.tedeevgv.patterns.creational.abstract_factory;

public class KotlinCodeEditorConfigurationFactory extends CodeEditorConfigurationFactory {
    @Override
    public SyntaxChecker syntaxChecker() {
        return new KotlinSyntaxChecker();
    }

    @Override
    public Compiler compiler() {
        return new KotlinCompiler();
    }
}
