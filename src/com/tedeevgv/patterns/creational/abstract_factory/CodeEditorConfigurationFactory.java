package com.tedeevgv.patterns.creational.abstract_factory;

public abstract class CodeEditorConfigurationFactory {
    abstract public SyntaxChecker syntaxChecker();

    abstract public Compiler compiler();
}
