package com.blogify.blogifyuserservice.service.imp;

import com.blogify.blogifyuserservice.model.entity.RoleEntity;
import com.blogify.blogifyuserservice.repository.RoleRepository;
import com.blogify.blogifyuserservice.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }
}
