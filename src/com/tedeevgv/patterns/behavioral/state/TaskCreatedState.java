package com.tedeevgv.patterns.behavioral.state;

public class TaskCreatedState extends TaskState {
    public TaskCreatedState(Task task) {
        super(task);
    }

    @Override
    public void moveToNextState() {
        var nextStep = new TaskInProgressState(task);
        task.setState(nextStep);
        System.out.println("Task " + task.getName() + " was moved to next state: " + nextStep.getStateName());
    }

    @Override
    protected String getStateName() {
        return "CREATED";
    }
}
