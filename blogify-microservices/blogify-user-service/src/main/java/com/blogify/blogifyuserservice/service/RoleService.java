package com.blogify.blogifyuserservice.service;

import com.blogify.blogifyuserservice.model.entity.RoleEntity;

import java.util.List;

public interface RoleService {

    List<RoleEntity> findAll();
}
