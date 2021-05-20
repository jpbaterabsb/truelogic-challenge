package com.truelogic.software.controller;

import com.truelogic.software.producer.UserProducer;
import com.truelogic.software.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {

    private final UserProducer userProducer;

    public UserController(UserProducer userProducer) {
        this.userProducer = userProducer;
    }

    @PostMapping
    public ResponseEntity<Void> sendUser(@RequestBody User user) {
        userProducer.send(user);
        return ResponseEntity.noContent().build();
    }
}
