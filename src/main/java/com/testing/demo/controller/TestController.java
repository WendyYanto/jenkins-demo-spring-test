package com.testing.demo.controller;

import com.testing.demo.entity.User;
import com.testing.demo.service.TestingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private final TestingService testingService;

    public TestController(TestingService testingService) {
        this.testingService = testingService;
    }

    @RequestMapping(method = RequestMethod.GET, value = TestControllerApiPath.TESTING)
    public User testing(@RequestParam(name = "user", defaultValue = "guest") String name) {
        return testingService.getData(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = TestControllerApiPath.TESTING)
    public User createUser(@RequestBody User user){
        return testingService.createUser(user);
    }

}
