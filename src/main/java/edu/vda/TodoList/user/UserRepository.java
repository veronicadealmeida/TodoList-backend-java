package edu.vda.TodoList.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository  extends JpaRepository<UserModel, UUID> {
    UserModel findByUserName(String username);
}
