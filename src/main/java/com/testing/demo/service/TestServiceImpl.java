package com.testing.demo.service;

import com.testing.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestingService {

    @Override
    public User getData(String name) {
        return User.builder().age(12).name("User : " + name).build();
    }

    @Override
    public User createUser(User user) {
        System.out.println(user);
        return user;
    }
}
