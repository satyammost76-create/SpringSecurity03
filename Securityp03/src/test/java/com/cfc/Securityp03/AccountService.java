package com.cfc.Securityp03;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public  String getBalance() {
        return "your balnce is:= 80000";
    }
    public  String Accountclose() {
        return "Acoount close";
    }
}
