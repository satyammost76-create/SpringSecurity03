package com.cfc.Securityp03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankController {
    @Autowired
    AccountService service;
    @GetMapping("/balance")
    public  String getBalence() {
     return    service.getBalance();

    }
    @PostMapping("/closed")
    public  String Accountclose() {
        return service.Accountclose();

    }
    @GetMapping("/about")
    public String getAbout() {
        return "hellow sir ham lunch per hai";
    }

}
