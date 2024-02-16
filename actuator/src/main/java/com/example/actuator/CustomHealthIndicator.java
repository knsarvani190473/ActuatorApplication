package com.example.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health(){
        boolean isServiceUp = checkExternalService();

        if(isServiceUp){
            return Health.up().withDetail("message", "Service is up").build();
        }
        else {
            return Health.down().withDetail("message", "Service is down").build();
        }
    }

    private boolean checkExternalService(){
        return true;
    }
}
