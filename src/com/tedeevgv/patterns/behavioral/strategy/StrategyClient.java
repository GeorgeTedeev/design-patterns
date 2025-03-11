package com.tedeevgv.patterns.behavioral.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Translator translator = new Translator(new GoogleTranslatorEngine());
        var textTranslatedByGoogleTranslator = translator.translate("some text");
        translator.setTranslatorEngine(new YandexTranslatorEngine());
        var textTranslatedByYandexTranslator = translator.translate("another some text");

        System.out.println("Google's translation: " + textTranslatedByGoogleTranslator);
        System.out.println("Yandex's translation: " + textTranslatedByYandexTranslator);
    }
}
