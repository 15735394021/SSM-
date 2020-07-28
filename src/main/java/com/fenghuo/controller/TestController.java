package com.fenghuo.controller;

import com.fenghuo.domain.Test;
import com.fenghuo.service.TestService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    public TestService testService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Test test(){
        return testService.query();
    }
}
