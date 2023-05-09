package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Users;
import com.Ecommerce.Ecommerce.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
}
