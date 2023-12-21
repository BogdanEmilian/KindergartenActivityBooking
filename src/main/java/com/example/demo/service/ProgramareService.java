package com.example.demo.service;

import com.example.demo.entity.Programare;
import com.example.demo.repo.ProgramareRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramareService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProgramareService.class);

    @Autowired
    private ProgramareRepository programareRepository;

    public void addProgramare(final Programare programare){
        LOGGER.info("Adding appointment from " + programare.getDataProgramare() + " of " + programare.getElev().getNume() + " " + programare.getElev().getPrenume());

        programareRepository.save(programare);
    }

    public List<Programare> findAllProgramari(){
        final List<Programare> programareList = new ArrayList<>();

        LOGGER.info("Getting all appointments in the database...");

        programareRepository.findAll().forEach(programare -> programareList.add(programare));

        LOGGER.info("All appointments have been returned");

        return programareList;
    }

    public void removeProgramare(Programare programare){
        programareRepository.delete(programare);

        LOGGER.info("Removed appointment from " + programare.getDataProgramare() + " of " + programare.getElev().getNume() + " " + programare.getElev().getPrenume());
    }
}
