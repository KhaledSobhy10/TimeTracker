package com.khdev.timetracker;

public class Task {
    private String taskName;
    private int taskId;
    private String taskCategory;
    private String taskDetail;
    private double taskTime;

    public Task(String taskName, String taskCategory, String taskDetail, double taskTime) {
        this.taskName = taskName;
        this.taskCategory = taskCategory;
        this.taskDetail = taskDetail;
        this.taskTime = taskTime;
    }

    public Task(int TaskId, String taskName, String taskCategory, String taskDetail, double taskTime) {
        this.taskId = TaskId;
        this.taskName = taskName;
        this.taskCategory = taskCategory;
        this.taskDetail = taskDetail;
        this.taskTime = taskTime;
    }

    public double getTaskTime() {
        return taskTime;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public String getTaskDetail() {
        return taskDetail;
    }
}
