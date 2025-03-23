package com.example.TP1WS.services;

import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;

import java.util.List;

public interface UserService {

    User createUser(UserDto userDto);

    List<User> getByName(String name);
}
