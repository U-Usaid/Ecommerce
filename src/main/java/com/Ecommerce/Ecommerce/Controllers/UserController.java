package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Users;
import com.Ecommerce.Ecommerce.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "getAll")

    public List<Users> getUsers(){
        return userService.getAllUsers();
    }
}
