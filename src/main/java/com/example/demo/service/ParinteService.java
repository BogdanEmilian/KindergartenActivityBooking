package com.example.demo.service;

import com.example.demo.entity.Parinte;
import com.example.demo.repo.ParinteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParinteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParinteService.class);

    @Autowired
    private ParinteRepository parinteRepository;

    public void addParinte(final Parinte parinte){
        LOGGER.info("Adding parent: " + parinte.getNumeParinte() + " " + parinte.getPrenumeParinte());

        parinteRepository.save(parinte);
    }

    public List<Parinte> findAllParinti(){
        final List<Parinte> parinteList = new ArrayList<>();

        LOGGER.info("Getting all parents in the database...");

        parinteRepository.findAll().forEach(parinte -> parinteList.add(parinte));

        LOGGER.info("All parents have been returned");

        return parinteList;
    }

    public void removeParinte(Parinte parinte){
        parinteRepository.delete(parinte);

        LOGGER.info("Removed parent: " + parinte.getNumeParinte() + " " + parinte.getPrenumeParinte());
    }
}
