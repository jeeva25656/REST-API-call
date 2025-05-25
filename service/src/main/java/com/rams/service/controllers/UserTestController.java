package com.rams.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rams.service.entity.UserTestEntity;
import com.rams.service.exceptions.TestResourceNotFoundException;
import com.rams.service.repository.UserTestRepository;

@RestController
@RequestMapping("test/user")
public class UserTestController {

    @Autowired
    private UserTestRepository userRepository;

    @GetMapping
    public List<UserTestEntity> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public UserTestEntity createUser(@RequestBody UserTestEntity user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public UserTestEntity getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new TestResourceNotFoundException("User Not Found with this id: " + id));
    }

    @PutMapping("/{id}")
    public UserTestEntity updateUser(@PathVariable Long id, @RequestBody UserTestEntity user) {
        UserTestEntity userData = userRepository.findById(id).orElseThrow(() -> new TestResourceNotFoundException("User Not Found with this id: " + id));
        userData.setEmail(user.getEmail());
        userData.setName(user.getName());
        return userRepository.save(userData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        UserTestEntity userData = userRepository.findById(id).orElseThrow(() -> new TestResourceNotFoundException("User Not Found with this id: " + id));
        userRepository.delete(userData);
        return ResponseEntity.ok().build();
    }
}
