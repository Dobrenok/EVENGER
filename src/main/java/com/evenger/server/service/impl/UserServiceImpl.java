package com.evenger.server.service.impl;

import com.evenger.server.entity.User;
import com.evenger.server.repository.UserRepository;
import com.evenger.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void delete(long id) {
        userRepository.delete(id);
    }
}
