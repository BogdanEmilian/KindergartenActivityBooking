package com.example.demo.service;

import com.example.demo.entity.ActivitateElevi;
import com.example.demo.repo.ActivitateEleviRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivitatiEleviService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActivitatiEleviService.class);

    @Autowired
    private ActivitateEleviRepository activitateEleviRepository;

    public void addActivitateElevi(final ActivitateElevi activitateElevi){
        LOGGER.info("Adding activity: " + activitateElevi.getNumeActivitate() + " for " + activitateElevi.getElev().getNume() + " " + activitateElevi.getElev().getPrenume());

        activitateEleviRepository.save(activitateElevi);
    }

    public List<ActivitateElevi> findAllActivitatiElevi(){
        final List<ActivitateElevi> activitateEleviList = new ArrayList<>();

        LOGGER.info("Getting all activities for students in the database...");

        activitateEleviRepository.findAll().forEach(activitateElevi -> activitateEleviList.add(activitateElevi));

        LOGGER.info("All activities for students have been returned");

        return activitateEleviList;
    }

    public void removeActivitateElevi(ActivitateElevi activitateElevi){
        activitateEleviRepository.delete(activitateElevi);

        LOGGER.info("Removed activity: " + activitateElevi.getNumeActivitate());
    }
}
