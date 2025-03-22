package com.example.TP1WS.services.impl;

import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.User;
import com.example.TP1WS.repository.UserRepository;
import com.example.TP1WS.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(UserDto userDto) {
        User user = new User(userDto.getFirstName(), userDto.getLastName());
        return userRepository.save(user);
    }

    @Override
    public List<User> getByFirstName(String name) {
        return userRepository.getUserByFirstName(name);
    }
}
