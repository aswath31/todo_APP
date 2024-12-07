package com.example.todoapp.TaskController;

import com.example.todoapp.Service.TaskService;

public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
