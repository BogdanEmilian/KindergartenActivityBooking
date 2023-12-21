package com.example.demo.service;

import com.example.demo.entity.Educatoare;
import com.example.demo.repo.EducatoareRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducatoareService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EducatoareService.class);

    @Autowired
    private EducatoareRepository educatoareRepository;

    public void addEducatoare(final Educatoare educatoare){
        LOGGER.info("Adding educator: " + educatoare.getNumeEducatoare() + " " + educatoare.getPrenumeEducatoare());

        educatoareRepository.save(educatoare);
    }

    public List<Educatoare> findAllEducatoare(){
        final List<Educatoare> educatoareList = new ArrayList<>();

        LOGGER.info("Getting all educators in the database...");

        educatoareRepository.findAll().forEach(educatoare -> educatoareList.add(educatoare));

        LOGGER.info("All educators have been returned");

        return educatoareList;
    }

    public void removeEducatoare(Educatoare educatoare){
        educatoareRepository.delete(educatoare);

        LOGGER.info("Removed educator: " + educatoare.getNumeEducatoare() + " " + educatoare.getPrenumeEducatoare());
    }
}
