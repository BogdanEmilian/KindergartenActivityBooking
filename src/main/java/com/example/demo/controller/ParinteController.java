package com.example.demo.controller;

import com.example.demo.entity.Parinte;
import com.example.demo.service.ParinteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParinteController {

    @Autowired
    private ParinteService parinteService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addParent/{nume}/{prenume}/{adresa}/{email}/{password}")
    public void createParent(@PathVariable String nume, @PathVariable String prenume, @PathVariable String adresa, @PathVariable String email, @PathVariable String password){
        parinteService.addParinte(new Parinte(nume, prenume, adresa, email, password));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/parents/")
    public List<Parinte> getParents(){
        return parinteService.findAllParinti();
    }

}
