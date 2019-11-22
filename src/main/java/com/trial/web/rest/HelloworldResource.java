package com.trial.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloworldResource controller
 */
@RestController
@RequestMapping("/api/helloworld")
public class HelloworldResource {

    private final Logger log = LoggerFactory.getLogger(HelloworldResource.class);

    /**
    * GET hello
    */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
