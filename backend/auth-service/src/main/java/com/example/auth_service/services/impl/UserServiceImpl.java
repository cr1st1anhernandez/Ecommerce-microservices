package com.example.auth_service.services.impl;

import com.example.auth_service.persistence.respositories.UserRepository;
import com.example.auth_service.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

}
