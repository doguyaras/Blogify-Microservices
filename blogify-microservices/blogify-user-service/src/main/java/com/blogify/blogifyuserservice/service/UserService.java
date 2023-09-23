package com.blogify.blogifyuserservice.service;

import com.blogify.blogifyuserservice.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> findAll();
    UserEntity findById(Long id);
    void delete(Long id);
    UserEntity save(UserEntity user);


}
