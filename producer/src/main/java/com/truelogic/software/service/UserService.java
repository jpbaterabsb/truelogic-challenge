package com.truelogic.software.service;

import com.truelogic.software.producer.UserProducer;
import com.truelogic.software.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserProducer userProducer;

    public void send(User user) {
        userProducer.send(user);
    }
}
