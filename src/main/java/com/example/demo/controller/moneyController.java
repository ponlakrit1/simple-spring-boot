package com.example.demo.controller;

import java.util.List;
import java.security.Principal;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.moneyService;
import com.example.demo.entity.moneyEntity;

@CrossOrigin
@RestController
@RequestMapping
public class moneyController {

    @Autowired
    moneyService MoneyService;

    @GetMapping(path = "/money/all")
    public List<moneyEntity> getAllMoneyDetail() {
        return MoneyService.allMoneyDetail();
    }

    @PostMapping(path = "/money/save")
    public Object onInsert(@RequestBody @Valid moneyEntity money,Principal principal){
        return MoneyService.saveMoneyList(money);
    }

    @GetMapping(path = "/money/find-by-pay")
    public Object findbyPayType(Principal principal,
                                  @RequestParam(name = "payType", required = true) String payType) {
        return MoneyService.findByAmount(payType);
    }

    @GetMapping(path = "/money/find-by-amount")
    public Object findByAmount(Principal principal,
                                  @RequestParam(name = "amount", required = true) int amount) {
        return MoneyService.findByAmount(amount);
    }

}
