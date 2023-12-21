package com.example.demo.service;

import com.example.demo.entity.Gradinita;
import com.example.demo.repo.GradinitaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradinitaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GradinitaService.class);

    @Autowired
    private GradinitaRepository gradinitaRepository;

    public void addGradinita(final Gradinita gradinita){
        LOGGER.info("Adding kindergarten: " + gradinita.getNumeGradinita());

        gradinitaRepository.save(gradinita);
    }

    public List<Gradinita> findAllGradinite(){
        final List<Gradinita> gradinitaList = new ArrayList<>();

        LOGGER.info("Getting all kindergartens in the database...");

        gradinitaRepository.findAll().forEach(gradinita -> gradinitaList.add(gradinita));

        LOGGER.info("All kindergartens have been returned");

        return gradinitaList;
    }

    public void removeGradinita(Gradinita gradinita){
        gradinitaRepository.delete(gradinita);

        LOGGER.info("Removed kindergarten: " + gradinita.getNumeGradinita());
    }
}
