package com.lesson.tasks.controller;


import com.lesson.tasks.data.model.Task;
import com.lesson.tasks.data.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/tasks")
public class TaskController implements Serializable {
    @Autowired
    TaskRepository taskRepository;

    @GetMapping()
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/priority/{priority}")
    public List<Task> getTasksByPriority(@PathVariable int priority) {
        return taskRepository.findByPriority(priority);
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable UUID id) {
        return taskRepository.findById(id).get();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        System.out.println(task);
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTask(@PathVariable UUID id) {
        System.out.println(id);
        taskRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
