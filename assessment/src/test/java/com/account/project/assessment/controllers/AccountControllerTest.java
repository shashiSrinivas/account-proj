package com.account.project.assessment.controllers;
import static com.jayway.restassured.RestAssured.get;
import static org.mockito.BDDMockito.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.account.project.assessment.model.Accounting;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(AccountController.class)
public class AccountControllerTest {


    @Autowired
    private MockMvc mockMvc;
    private AccountController mockAccountController;

 

    @Test
    public void getAccounts() throws Exception{
       
        List<Accounting> accountList = new ArrayList<>();
        Accounting mockAccounting = new Accounting();
        mockAccounting.setAccountNumber("1234");
        mockAccounting.setFirstName("shashi");
        mockAccounting.setSecondName("srinivas");
        mockAccounting.setId(1);
    
        accountList.add(mockAccounting);

        given(mockAccountController.getAllAccounts()).willReturn(accountList);
        
        //this.mockMvc.perform(get("/account-project/rest/account/json").andExpect(status().isOk()).andExpect(content().string(containsString("shashi"))));

    }
}