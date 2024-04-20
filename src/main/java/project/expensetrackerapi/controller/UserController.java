package project.expensetrackerapi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.expensetrackerapi.entity.User;
import project.expensetrackerapi.entity.UserModel;
import project.expensetrackerapi.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> save(@Valid @RequestBody UserModel user){
    return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
    }
}

