package edu.vda.TodoList.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
}
