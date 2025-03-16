package com.tedeevgv.patterns.creational.abstract_factory;

import static java.util.Objects.isNull;

public class CodeEditor {
    private CodeEditorConfigurationFactory configurationFactory;

    public void compile(String code) {
        if (isNull(configurationFactory)) {
            System.out.println("WARN: need to set configuration");
        }
        if (configurationFactory.syntaxChecker().check(code)) {
            configurationFactory.compiler().compile(code);
            return;
        }

        System.out.println("WARN: code didn't pass syntax checks");
    }

    void setConfigurationFactory(CodeEditorConfigurationFactory configurationFactory) {
        this.configurationFactory = configurationFactory;
    }
}
