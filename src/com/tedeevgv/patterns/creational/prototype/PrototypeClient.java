package com.tedeevgv.patterns.creational.prototype;

public class PrototypeClient {
    public static void main(String[] args) {
        EditorElement textElement = new TextElement("some_text");
        EditorElement clonedTextElement = textElement.clone();

        ((TextElement) clonedTextElement).setText("new_text");

        textElement.printValue();
        clonedTextElement.printValue();

        EditorElement imgElement = new ImageElement(new byte[]{1,2,3});
        EditorElement clonedImgElement = imgElement.clone();

        imgElement.printValue();
        clonedImgElement.printValue();
    }
}
