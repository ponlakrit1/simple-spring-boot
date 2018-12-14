package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.personEntity;

@Repository
public interface personRepos extends CrudRepository<personEntity, Long> {

    public List<personEntity> findAll();

}