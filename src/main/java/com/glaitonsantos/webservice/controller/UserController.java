package com.glaitonsantos.webservice.controller;

import com.glaitonsantos.webservice.domain.UserDomain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserDomain> findAllUsers(){
        UserDomain user = new UserDomain(1L, "Maria", "maria@gmail.com", "999999", "123456");
        return ResponseEntity.ok().body(user);
    }

}
