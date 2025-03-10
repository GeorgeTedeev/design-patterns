package com.tedeevgv.patterns.behavioral.state;

public class StateClient {
    public static void main(String[] args) {
        var task = new Task("Some task");
        task.moveToNextState();
        task.moveToNextState();
        task.moveToNextState();
    }
}
