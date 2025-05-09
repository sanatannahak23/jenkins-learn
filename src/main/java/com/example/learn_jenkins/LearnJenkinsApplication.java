package com.example.learn_jenkins;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJenkinsApplication {

    private static final Logger log = LoggerFactory.getLogger(LearnJenkinsApplication.class);

    @PostConstruct
    public void init() {
        log.info("Trying to do continuous integration..");
		log.info("A additional feature is added...");
    }

    public static void main(String[] args) {
        log.info("This is main method which is executed...");
        SpringApplication.run(LearnJenkinsApplication.class, args);
    }

    @PreDestroy
    public void destroy() {
        log.info("project executed successfully...");
		log.info("That additional feature is also deleted...");
    }

	public void oneMore(){
		log.info("simply added...");
	}

}
