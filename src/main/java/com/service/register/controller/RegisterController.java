package com.service.register.controller;

import com.service.register.service.RegisterService;
import com.service.register.wrappers.request.RegisterRequest;
import com.service.register.wrappers.response.RegisterResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    RegisterService registerService;

    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {

        ResponseEntity.BodyBuilder bodyBuilder;
        RegisterResponse response = new RegisterResponse();
        String code;

        try {

            if(request.getUsername().isEmpty()){
                throw new Exception();
            } else {
                code = registerService.registerCandidate(request.getUsername());
            }

            response.setCode(code);
            response.setStatus("OK");

            bodyBuilder = ResponseEntity.status(HttpStatus.OK);

        } catch (Exception e) {
            logger.info("Generating code");
            response.setStatus("ERROR");
            bodyBuilder = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("Response: "+response.toString());
        return bodyBuilder.body(response);

    }


}
