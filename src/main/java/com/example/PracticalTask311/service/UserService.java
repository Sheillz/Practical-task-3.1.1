package com.example.PracticalTask311.service;

import com.example.PracticalTask311.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);
}
