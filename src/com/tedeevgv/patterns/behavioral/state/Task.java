package com.tedeevgv.patterns.behavioral.state;

public class Task {
    private TaskState state = new TaskCreatedState(this);
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void moveToNextState() {
        state.moveToNextState();
    }

    public String getName() {
        return this.name;
    }
}
