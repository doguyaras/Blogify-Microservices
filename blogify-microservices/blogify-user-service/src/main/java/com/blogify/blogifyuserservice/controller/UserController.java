package com.blogify.blogifyuserservice.controller;

import com.blogify.blogifyuserservice.model.entity.UserEntity;
import com.blogify.blogifyuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/add")
    public UserEntity add(@RequestBody UserEntity user){
        user.setUserId(0L);
        return userService.save(user);
    }

    @PutMapping("/update")
    public UserEntity update(@RequestBody UserEntity user){
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        userService.delete(id);
        return "User deleted successfully: "+id;
    }

}
