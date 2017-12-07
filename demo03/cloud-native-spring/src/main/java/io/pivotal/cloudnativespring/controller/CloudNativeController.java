package io.pivotal.cloudnativespring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CloudNativeController {

    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    @Value("${greeting}")
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @RequestMapping("/hello")
	public String hello() {
		return String.format("%s There!", getGreeting());
	}
}
