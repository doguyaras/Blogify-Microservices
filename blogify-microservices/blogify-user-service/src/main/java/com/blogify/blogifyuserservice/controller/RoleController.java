package com.blogify.blogifyuserservice.controller;

import com.blogify.blogifyuserservice.model.entity.RoleEntity;
import com.blogify.blogifyuserservice.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@Slf4j
public class RoleController {

    private final RoleService roleService;

    @GetMapping
    public List<RoleEntity> findAll() {
        return roleService.findAll();
    }

}
