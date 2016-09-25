package com.evenger.server.service;

import com.evenger.server.entity.User;

public interface UserService
{
    User addUser(User user);
    void delete(long id);
}
