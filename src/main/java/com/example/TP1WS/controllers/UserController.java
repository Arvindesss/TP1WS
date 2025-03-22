package com.example.TP1WS.controllers;


import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;
import com.example.TP1WS.services.UserServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserController {

    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/v1/name")
    public ResponseEntity<User> getUserByName(String name) {
        User user = userService.getByName(name);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/v1/name")
    public ResponseEntity<User> createUser(UserDto userDto) {
        User user = userService.createUser(userDto);
        return ResponseEntity.ok(user);
    }

}
