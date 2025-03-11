package com.tedeevgv.patterns.behavioral.strategy;

public class GoogleTranslatorEngine implements TranslatorEngine {
    @Override
    public String translate(String text) {
        return "translated by google";
    }
}
