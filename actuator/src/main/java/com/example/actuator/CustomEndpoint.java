package com.example.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "custom-endpoint")
public class CustomEndpoint {

    private String initialString = "Hi using custom endpoint";

    @ReadOperation
    @Bean
    public String custom(){
        return initialString;
    }

    @WriteOperation
    public void update(String newValue){
        initialString = newValue;
    }

}


