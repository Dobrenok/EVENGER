package com.evenger.server.service.impl;

import com.evenger.server.repository.LoginRepository;
import com.evenger.server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService
{
    @Autowired
    private LoginRepository loginRepository;
}
