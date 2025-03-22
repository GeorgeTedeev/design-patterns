package com.tedeevgv.patterns.behavioral.memento;

public class MementoClient {
    public static void main(String[] args) {
        var editor = new Editor();

        editor.changeText("Some text v1");
        editor.changeText("Some text v2");
        editor.changeText("Some text v3");

        editor.undo();
        editor.undo();

        editor.save();
        editor.printCurrentState();
    }
}
