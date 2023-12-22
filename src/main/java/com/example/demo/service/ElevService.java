package com.example.demo.service;

import com.example.demo.entity.Elev;
import com.example.demo.repo.ElevRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ElevService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ElevService.class);

    @Autowired
    private ElevRepository elevRepository;

    public void addElev(final Elev elev){
        LOGGER.info("Adding student: " + elev.getNume() + " " + elev.getPrenume());

        elevRepository.save(elev);
    }

    public List<Elev> findAllElevi(){
        final List<Elev> elevList = new ArrayList<>();

        LOGGER.info("Getting all students in the database...");

        elevRepository.findAll().forEach(elev -> elevList.add(elev));

        LOGGER.info("All students have been returned");

        return elevList;
    }

    public void removeElev(Elev elev){
        elevRepository.delete(elev);

        LOGGER.info("Removed student: " + elev.getNume() + " " + elev.getPrenume());
    }

    public Elev findById(int id){
        Optional<Elev> elev = elevRepository.findById(id);

        if (elev.isPresent())
        {
            return elev.get();
        }
        else
        {
            throw new RuntimeException("Couldn't find student by id: " + id);
        }
    }
}
