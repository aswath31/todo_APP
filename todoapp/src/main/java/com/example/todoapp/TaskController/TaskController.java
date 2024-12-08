package com.example.todoapp.TaskController;

import com.example.todoapp.Service.TaskService;
import com.example.todoapp.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
/*
    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks =  taskService.getAllTasks();
        model.addAttribute("tasks" , tasks);
        return"tasks";
    }
*/
    @GetMapping
    public List<Task> getTasks(){
        return taskService.getAllTasks();
    }
    @PostMapping("/")
    public Task createTask(@RequestBody  Task task){
        task.setCompleted(false);
        return taskService.createTask(task);

    }



}
