package com.testing.demo.controller;

import com.testing.demo.service.TestingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestingService testingService;

    public TestController(TestingService testingService) {
        this.testingService = testingService;
    }

    @RequestMapping(method = RequestMethod.GET, value = TestControllerApiPath.TESTING)
    public String testing() {
        return testingService.getData();
    }

}
