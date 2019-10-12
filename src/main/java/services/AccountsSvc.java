package main.java.services;

import main.java.POJO.*;
import main.java.jpa_repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;

@RestController
public class AccountsSvc{

    @Autowired
    AccountRepo accountRepo;

    Accounts accounts;

    public List<Accounts> getAll(){
        return accountRepo.findAll();
    }

    public boolean create(Map<String, String> account){
        Accounts returnAcc = accountRepo.save(new Accounts(Integer.parseInt(account.get("accID")), account.get("accNo"), Double.parseDouble(account.get("current_bal")), Double.parseDouble(account.get("min_bal")), Double.parseDouble(account.get("trans_limit"))));
        return (returnAcc != null) ? true: false;
    }

}