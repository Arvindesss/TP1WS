package com.example.TP1WS.services;

import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;

public interface UserService {

    User createUser(UserDto userDto);

    User getByName(String name);
}
