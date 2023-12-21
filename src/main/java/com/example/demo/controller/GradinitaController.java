package com.example.demo.controller;

import com.example.demo.entity.Gradinita;
import com.example.demo.service.GradinitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradinitaController {

    @Autowired
    private GradinitaService gradinitaService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addKindergarten/{nume}/{adresa}/{contact}")
    public void createKindergarten(@PathVariable String nume, @PathVariable String adresa, @PathVariable String contact){
        gradinitaService.addGradinita(new Gradinita(nume, adresa, contact));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/kindergartens/")
    public List<Gradinita> getKindergartens(){
        return gradinitaService.findAllGradinite();
    }
}
