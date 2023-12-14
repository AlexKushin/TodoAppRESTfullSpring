package com.okushyn.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworld-bean")
    public HelloWorldBean getHelloWorldBean(){
        //throw new RuntimeException("Some error has happened");
        return new HelloWorldBean("Hello world");
    }

    @GetMapping("/helloworld/pathvariable/{name}")
    public HelloWorldBean getHelloWorldPathVar(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s",name));
    }

}
