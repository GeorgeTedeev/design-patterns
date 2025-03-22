package com.tedeevgv.patterns.creational.prototype;

public class TextElement extends EditorElement {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }
    @Override
    public EditorElement clone() {
        return new TextElement(text);
    }

    @Override
    public void printValue() {
        System.out.println("Content of text is: " + text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
