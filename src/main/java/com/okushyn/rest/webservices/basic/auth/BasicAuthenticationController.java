package com.okushyn.rest.webservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {


    @GetMapping("/basicauth")
    public AuthenticationBean getHelloWorldBean() {
        return new AuthenticationBean("Yua are Authenticated");
    }
}
