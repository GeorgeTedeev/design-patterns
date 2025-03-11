package com.tedeevgv.patterns.behavioral.strategy;

public class Translator {
    private TranslatorEngine translatorEngine;

    public Translator(TranslatorEngine translatorEngine) {
        this.translatorEngine = translatorEngine;
    }

    public String translate(String text) {
        return translatorEngine.translate(text);
    }

    public void setTranslatorEngine(TranslatorEngine translatorEngine) {
        this.translatorEngine = translatorEngine;
    }
}
