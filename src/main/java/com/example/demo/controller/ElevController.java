package com.example.demo.controller;

import com.example.demo.entity.Elev;
import com.example.demo.service.ElevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ElevController {

    @Autowired
    private ElevService elevService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addStudent/{nume}/{prenume}/{dataNastere}/{adresa}")
    public void createElev(@PathVariable String nume, @PathVariable String prenume, @PathVariable String dataNastere, @PathVariable String adresa){
        elevService.addElev(new Elev(nume, prenume, new Date(), adresa));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/students/")
    public List<Elev> getStudents(){
        return elevService.findAllElevi();
    }
}
