package com.tedeevgv.patterns.behavioral.state;

public class TaskInProgressState extends TaskState {
    public TaskInProgressState(Task task) {
        super(task);
    }

    @Override
    public void moveToNextState() {
        var nextStep = new TaskFinishedState(task);
        task.setState(nextStep);
        System.out.println("Task " + task.getName() + " was moved to next state: " + nextStep.getStateName());
    }

    @Override
    protected String getStateName() {
        return "IN_PROGRESS";
    }
}
