package com.lesson.tasks.data.repository;

import com.lesson.tasks.data.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    public List<Task> findByPriority(int priority);
}
