package com.service.register.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/health")
    @ResponseStatus(code = HttpStatus.OK, reason = "Health check")
    public void healthCheck(){
        logger.info("Health check: OK");
    }

}
