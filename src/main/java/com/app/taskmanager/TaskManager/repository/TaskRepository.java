package com.app.taskmanager.TaskManager.repository;

import com.app.taskmanager.TaskManager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    
}
