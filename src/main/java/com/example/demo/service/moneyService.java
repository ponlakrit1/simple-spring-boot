package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repos.moneyRepos;
import com.example.demo.entity.moneyEntity;

@Service
public class moneyService {

    @Autowired
    moneyRepos moneyRepo;

    public List<moneyEntity> allMoneyDetail() {
        return (List<moneyEntity>) moneyRepo.findAll();
    }

    public moneyEntity saveMoneyList(moneyEntity money){
        return moneyRepo.save(money);
    }

    public List<moneyEntity> findByAmount(String payType) {
        return moneyRepo.findByPayType(payType);
    }

    public List<moneyEntity> findByAmount(int key) {
        return moneyRepo.findByAmount(key);
    }

}
