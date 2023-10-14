package edu.vda.TodoList.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel>findByIdUser(UUID idUSer);
    TaskModel findByIdAndIdUser(UUID id, UUID idUSer);
}
