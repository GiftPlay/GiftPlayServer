package com.unibta.PMIII.controllers;

import com.unibta.PMIII.models.Error;
import com.unibta.PMIII.models.Login;
import com.unibta.PMIII.models.User;
import com.unibta.PMIII.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("v1/user")
    public ResponseEntity<User> create(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("v1/user")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAll());
    }

    @GetMapping("v1/user/{id}")
    public ResponseEntity<User> getOne(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getById(id));
    }

    @PutMapping("v1/user")
    public ResponseEntity<User> update(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("v1/user/{id}")
    public ResponseEntity<User> deleteOne(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("v2/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        User ret = userService.login(login.getEmail(), login.getPassword());

            if (ret == null || ret.getEmail() == null || !ret.getEmail().equals(login.getEmail())) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Usuário não encontrado!", HttpStatus .NOT_FOUND.value(), HttpStatus.NOT_FOUND.name().replace("_", " ")));
            }

        return ResponseEntity.status(HttpStatus.OK).body(ret);
    }

    @PostMapping("v2/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User ret = userService.register(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(ret);
    }
}

