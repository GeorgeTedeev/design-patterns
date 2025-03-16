package com.tedeevgv.patterns.creational.abstract_factory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        var codeEditor = new CodeEditor();

        var code = "java code";
        codeEditor.setConfigurationFactory(new JavaCodeEditorConfigurationFactory());
        codeEditor.compile(code);

        codeEditor.setConfigurationFactory(new KotlinCodeEditorConfigurationFactory());
        codeEditor.compile(code);
        code = "kotlin code";
        codeEditor.compile(code);
    }
}
