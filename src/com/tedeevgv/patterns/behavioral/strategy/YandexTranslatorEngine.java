package com.tedeevgv.patterns.behavioral.strategy;

public class YandexTranslatorEngine implements TranslatorEngine {
    @Override
    public String translate(String text) {
        return "переведен яндекс переводчиком";
    }
}
