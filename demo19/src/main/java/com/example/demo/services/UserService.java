package com.example.demo.services;

import com.example.demo.DTO.UserDto;
import com.example.demo.models.User;

import java.util.List;

public interface UserService {
    void deleteUser(User user);
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
