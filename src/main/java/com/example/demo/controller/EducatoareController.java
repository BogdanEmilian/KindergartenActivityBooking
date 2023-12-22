package com.example.demo.controller;

import com.example.demo.entity.Educatoare;
import com.example.demo.entity.Gradinita;
import com.example.demo.service.EducatoareService;
import com.example.demo.service.GradinitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducatoareController {

    @Autowired
    private EducatoareService educatoareService;

    @Autowired
    private GradinitaService gradinitaService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addEducatoare/{nume}/{prenume}/{gradinitaId}")
    public void createEducatoare(@PathVariable String nume, @PathVariable String prenume, @PathVariable int gradinitaId){
        educatoareService.addEducatoare(new Educatoare(nume, prenume, gradinitaService.findById(gradinitaId)));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/educatoare/")
    public List<Educatoare> getEducatoares(){
        return educatoareService.findAllEducatoare();
    }
}
