package com.cognizant.account.Controller;

import com.cognizant.account.Model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(
                number,
                "savings",
                234343
        );
    }
}