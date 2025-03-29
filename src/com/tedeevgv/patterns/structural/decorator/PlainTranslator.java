package com.tedeevgv.patterns.structural.decorator;

public class PlainTranslator implements Translator {
    @Override
    public String translate(String text) {
        return "This text translated";
    }
}
