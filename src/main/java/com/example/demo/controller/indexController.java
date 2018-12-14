package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.personService;
import com.example.demo.entity.personEntity;

@RestController
@RequestMapping
public class indexController {

    private personService PersonService;

    @Autowired
    public indexController(personService PersonService) {
        this.PersonService = PersonService;
    }

    @GetMapping(path = "/")
    public List<personEntity> getUserDetail() {
        return PersonService.userDetail();
    }

}
