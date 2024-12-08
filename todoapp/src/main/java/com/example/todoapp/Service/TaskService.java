package com.example.todoapp.Service;

import com.example.todoapp.model.Task;
import com.example.todoapp.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(Task task){
        task.setCompleted(false);
        return taskRepository.save(task);
    }
 }
