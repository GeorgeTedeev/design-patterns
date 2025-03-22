package com.tedeevgv.patterns.behavioral.memento;

import java.util.Stack;

public class Editor {
    private final TextBlock textBlock = new TextBlock();
    private final Stack<TextState> oldStates = new Stack<>();

    public void changeText(String text) {
        oldStates.push(this.textBlock.captureState());
        this.textBlock.changeState(new TextState(text));
    }

    public void undo() {
        if (oldStates.isEmpty()) {
            System.out.println("Can't undo, cause history is empty!");
            return;
        }

        textBlock.changeState(oldStates.pop());
    }

    public void save() {
        oldStates.clear();
    }

    public void printCurrentState() {
        textBlock.printCurrentState();
    }
}
