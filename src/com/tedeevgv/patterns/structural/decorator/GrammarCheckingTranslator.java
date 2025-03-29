package com.tedeevgv.patterns.structural.decorator;

public class GrammarCheckingTranslator implements Translator {
    private final Translator translator;

    public GrammarCheckingTranslator(Translator translator) {
        this.translator = translator;
    }

    @Override
    public String translate(String text) {
        var sourceText = translator.translate(text);
        // some imitation of grammar checking and corrections
        return "This text was translated (text without grammar corrections: '" + sourceText + "')";
    }
}
