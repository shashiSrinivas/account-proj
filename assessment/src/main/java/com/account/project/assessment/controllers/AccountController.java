package com.account.project.assessment.controllers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.account.project.assessment.model.Accounting;
import com.account.project.assessment.model.DisplayMessage;

@RestController
public class AccountController {
    private List<Accounting> accounts = new ArrayList<>();  
    
    private AtomicLong nextId = new AtomicLong();
  
    private DisplayMessage  msg = new DisplayMessage();

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello Spring Boot world!";
    }

    @PostMapping("/account-project/rest/account/json")
    @ResponseStatus(HttpStatus.CREATED)
    public DisplayMessage createNewAccount(@RequestBody Accounting account) {
        // Set Account to have next ID:
        account.setId(nextId.incrementAndGet());        

        accounts.add(account);
        msg.setMessage("account has been successfully added");
        
        return msg ;
    }
    
 

    @GetMapping("/account-project/rest/account/json")
    public List<Accounting> getAllAccounts() {
        return accounts;
    }

     
    
    
    @DeleteMapping("/account-project/rest/account/json/{id}")
    public DisplayMessage deleteOneAccount(
            @PathVariable("id") long accountId )
           
    {
    	for (Accounting account : accounts) {
            if (account.getId() == accountId) {
            	accounts.remove(account);
            	 msg.setMessage("account successfully deleted");                 
                 return msg ;
            }
        }


        throw new IllegalArgumentException();
    }

    // Create Exception Handle
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,
                reason = "Request ID not found.")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {
        // Nothing to do
    }
}
