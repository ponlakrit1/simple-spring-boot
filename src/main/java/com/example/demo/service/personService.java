package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repos.personRepos;
import com.example.demo.entity.personEntity;

@Service
public class personService {

    @Autowired
    personRepos personRepo;

    public List<personEntity> userDetail() {
        return personRepo.findAll();
    }

}
