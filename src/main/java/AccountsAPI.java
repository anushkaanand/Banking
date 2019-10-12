package main.java;

import main.java.services.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class AccountsAPI{
    
    AccountsSvc accSvc = new AccountsSvc();

    @PostMapping("/accounts/")
    String createAcc(@RequestBody Map<String, String> account){
        return (accSvc.create(account) == null) ? "Failed" : "Success";
    }
}