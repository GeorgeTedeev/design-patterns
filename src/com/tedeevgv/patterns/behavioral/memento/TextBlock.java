package com.tedeevgv.patterns.behavioral.memento;

class TextBlock {
    private String currentState = "";

    void changeState(TextState state) {
        this.currentState = state.getText();
    }

    TextState captureState() {
        return new TextState(this.currentState);
    }

    void printCurrentState() {
        System.out.println(this.currentState);
    }
}
