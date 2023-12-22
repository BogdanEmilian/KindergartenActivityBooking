package com.example.demo.controller;

import com.example.demo.entity.ActivitateElevi;
import com.example.demo.service.ActivitatiEleviService;
import com.example.demo.service.ElevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ActivitateController {

    @Autowired
    private ActivitatiEleviService activitatiEleviService;

    @Autowired
    private ElevService elevService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addActivity/{nume}/{descriere}/{elev}/{data}")
    public void createActivity(@PathVariable String nume, @PathVariable String descriere, @PathVariable int elev, @PathVariable String data){
        activitatiEleviService.addActivitateElevi(new ActivitateElevi(nume, descriere, new Date(), elevService.findById(elev)));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/activities/")
    public List<ActivitateElevi> getActivities(){
        return activitatiEleviService.findAllActivitatiElevi();
    }



}
