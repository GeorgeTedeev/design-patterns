package com.tedeevgv.patterns.creational.abstract_factory;

public class JavaCodeEditorConfigurationFactory extends CodeEditorConfigurationFactory {
    @Override
    public SyntaxChecker syntaxChecker() {
        return new JavaSyntaxChecker();
    }

    @Override
    public Compiler compiler() {
        return new JavaCompiler();
    }
}
