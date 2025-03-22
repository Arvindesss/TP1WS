package com.example.TP1WS.controllers;


import com.example.TP1WS.dto.mapper.UserToUserResponseConverter;
import com.example.TP1WS.dto.response.UserResponse;
import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;
import com.example.TP1WS.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/name")
    public ResponseEntity<List<UserResponse>> getUserByFirstName(String name) {
        List<User> user = userService.getByFirstName(name);
        List<UserResponse> userResponses = UserToUserResponseConverter.convert(user);
        return ResponseEntity.ok(userResponses);
    }

    @PostMapping("")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(userDto);
        UserResponse userResponse = UserToUserResponseConverter.convert(user);
        return ResponseEntity.ok(userResponse);
    }
}
