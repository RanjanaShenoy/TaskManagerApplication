package com.app.taskmanager.TaskManager.service;

import com.app.taskmanager.TaskManager.entity.Task;
import com.app.taskmanager.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTasksById(UUID taskId){
        return taskRepository.findById(taskId);
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public String deleteTaskById(UUID taskId){
        int subTaskCount=0;
        Task task = taskRepository.findById(taskId).orElse(null);
        if(task != null){
            taskRepository.delete(task);
            return "Deleted successfully!";
        }
        return "Error! Task not deleted.";
    }

}
