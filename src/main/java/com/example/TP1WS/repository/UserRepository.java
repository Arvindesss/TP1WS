package com.example.TP1WS.repository;

import com.example.TP1WS.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    List<User> getUserByFirstName(String name);

    User getUserById(UUID id);
}
