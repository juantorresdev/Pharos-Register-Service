package com.service.register.service;

import com.service.register.model.Candidate;
import com.service.register.repository.CandidateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    CandidateRepository candidateRepository;

    Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

    public String registerCandidate(String username){

        UUID uuid = null;
        Candidate candidate = new Candidate();

        try {

            uuid = UUID.randomUUID();
            logger.info("Generated UUID at Service: " + uuid.toString());

            candidate.setIdCandidate(uuid.toString());
            candidate.setUsername(username);
            candidate.setCode(uuid.toString());
            candidate.setStatus("Registered");
            candidate.setIsActive("Active");

            logger.info("Saving candidate" + candidate.toString());

            candidateRepository.save(candidate);
        } catch (Exception e){
            e.printStackTrace();
        }

        return uuid.toString();
    }

}
