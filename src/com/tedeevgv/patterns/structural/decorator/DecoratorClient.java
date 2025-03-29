package com.tedeevgv.patterns.structural.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Translator translator = new GrammarCheckingTranslator(new PlainTranslator());

        System.out.println("Translated text: " + translator.translate("some text"));
    }
}
