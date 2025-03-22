package com.example.TP1WS.dto.mapper;

import com.example.TP1WS.dto.response.UserResponse;
import com.example.TP1WS.models.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserToUserResponseConverter {

    public static UserResponse convert(User user) {
        return new UserResponse(
                user.getFirstName(),
                user.getLastName()
        );
    }

    public static List<UserResponse> convert(List<User> users) {
        return users.stream()
                .map(UserToUserResponseConverter::convert)
                .collect(Collectors.toList());
    }
}
