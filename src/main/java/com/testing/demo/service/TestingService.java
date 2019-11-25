package com.testing.demo.service;

import com.testing.demo.entity.User;

public interface TestingService {
    User getData(String name);
    User createUser(User user);
}
