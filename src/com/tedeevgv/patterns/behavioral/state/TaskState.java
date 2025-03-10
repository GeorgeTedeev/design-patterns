package com.tedeevgv.patterns.behavioral.state;

public abstract class TaskState {
    protected Task task;
    public TaskState(Task task) {
        this.task = task;
    }
    public abstract void moveToNextState();

    protected abstract String getStateName();
}
