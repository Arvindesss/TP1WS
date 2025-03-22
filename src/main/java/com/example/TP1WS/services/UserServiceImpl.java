package com.example.TP1WS.services;

import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;
import com.example.TP1WS.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserDto userDto,AddressDto addressDto) {
        List<Address> address = new ArrayList<>();
        for (AddressDto dto : userDto.getAddress()) {
            address.add(new Address(dto.getStreetName(), dto.getCity(), dto.getPostalCode(), dto.getCountry()));
        }
        User user = new User(userDto.getFirstName(), userDto.getLastName(), address);
        return userRepository.save(user);
    }

    @Override
    public User getByName(String name) {
        return userRepository.getUserByFirstName(name);
    }
}
