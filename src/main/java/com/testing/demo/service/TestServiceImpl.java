package com.testing.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestingService {

    @Override
    public String getData() {
        return "Hello From MAC From Service";
    }
}
