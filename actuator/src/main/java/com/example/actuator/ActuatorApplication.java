package com.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(ActuatorApplication.class, args);
	}

}

/* /actuator - Hypermedia for actuator endpoints.

Pre-defined end points
        /beans returns all available beans in our BeanFactory. Unlike /auditevents, it doesn’t support filtering.
        /conditions, formerly known as /autoconfig, builds a report of conditions around autoconfiguration.
        /configprops allows us to fetch all @ConfigurationProperties beans.
        /env returns the current environment properties. Additionally, we can retrieve single properties.
        /health summarizes the health status of our application.
        /info returns general information. It might be custom data, build information or details about the latest commit.
        /loggers enables us to query and modify the logging level of our application.
        /metrics details metrics of our application. This might include generic metrics as well as custom ones.
        /scheduledtasks provides details about every scheduled task within our application.
        /shutdown performs a graceful shutdown of the application.
        /threaddump dumps the thread information of the underlying JVM.     */
