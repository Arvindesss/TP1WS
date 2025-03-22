package com.example.TP1WS.repository;

import com.example.TP1WS.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    User getUserByFirstName(String name);
}
