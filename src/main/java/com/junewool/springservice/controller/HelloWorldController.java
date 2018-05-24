package com.junewool.springservice.controller;

import com.junewool.springservice.pojo.request.RequestGreeting;
import com.junewool.springservice.pojo.response.ResponseGreeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HelloWorldController {

    private static final String template = "Hello, %s!";

    @RequestMapping(value = "/greeting")
    public ResponseGreeting greeting(RequestGreeting requestGreeting) {
        return new ResponseGreeting(1, String.format(template, requestGreeting.name));
    }
}
