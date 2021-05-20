package com.truelogic.software.producer;

import com.truelogic.software.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Slf4j
public class UserProducer {

    @Value("${user.topic}")
    private String userTopic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public UserProducer(final KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final @RequestBody User user) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            kafkaTemplate.send(userTopic, user.getEmail(), objectMapper.writeValueAsString(user));
        } catch (JsonProcessingException e) {
            log.error("Error: kafka couldn't publish message ::: {}", user);
        }
    }

}
