package edu.vda.TodoList.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "va1_users")
public class UserModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "va1_id")
    private UUID id;

    @Column(name = "va1_username", unique = true)
    private String userName;

    @Column(name = "va1_name")
    private String name;

    @Column(name = "va1_password")
    private String password;

    @CreationTimestamp
    @Column(name = "va1_createdAt")
    private LocalDateTime createdAt;
}
