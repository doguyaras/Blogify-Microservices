package com.blogify.blogifyuserservice.repository;

import com.blogify.blogifyuserservice.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository
        extends JpaRepository<RoleEntity,Long> {
}
