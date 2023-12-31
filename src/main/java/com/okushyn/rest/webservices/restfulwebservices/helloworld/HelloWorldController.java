package com.okushyn.rest.webservices.restfulwebservices.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworld-bean")
    public HelloWorldBean getHelloWorldBean(){
        return new HelloWorldBean("Hello world");
    }
    @GetMapping("/helloworld/pathvariable/{name}")
    public HelloWorldBean getHelloWorldPathVar(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s",name));
    }

}
