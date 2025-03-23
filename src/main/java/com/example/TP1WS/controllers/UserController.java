package com.example.TP1WS.controllers;


import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;
import com.example.TP1WS.services.UserService;
import com.example.TP1WS.services.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1/users")
public class UserController {

    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getUserByName(String name) {
        List<User> user = userService.getByName(name);
        return ResponseEntity.ok(user);
    }

    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(userDto);
        return ResponseEntity
                .created(URI.create("v1/users" + user.getId()))
                .body(user);
    }
}
