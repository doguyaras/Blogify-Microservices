package com.blogify.blogifyuserservice.service.imp;

import com.blogify.blogifyuserservice.model.entity.UserEntity;
import com.blogify.blogifyuserservice.repository.UserRepository;
import com.blogify.blogifyuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findById(Long id) {

        Optional<UserEntity> result = userRepository.findById(id);
        UserEntity user;

        if (result.isPresent()) {
            user = result.get();
        } else {
            throw new RuntimeException("Id can not find:" + id);
        }
        return user;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<UserEntity> result = userRepository.findById(id);
        UserEntity user = null;
        if(result.isPresent()){
            user = result.get();
            userRepository.deleteById(user.getUserId());
        }else {
            throw new RuntimeException("Did not find user id: "+id);
        }

    }

    @Override
    @Transactional
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }


}
