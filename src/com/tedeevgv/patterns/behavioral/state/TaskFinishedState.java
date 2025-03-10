package com.tedeevgv.patterns.behavioral.state;

public class TaskFinishedState extends TaskState {
     public TaskFinishedState(Task task) {
        super(task);
    }

    @Override
    public void moveToNextState() {
        System.out.println("Task " + task.getName() + " can't be moved, cause it's finished");
    }

    @Override
    protected String getStateName() {
        return "FINISHED";
    }
}
