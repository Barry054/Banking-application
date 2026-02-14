package dev.barry.barryTechBankingApplication.controller;

import dev.barry.barryTechBankingApplication.dto.*;
import dev.barry.barryTechBankingApplication.service.impli.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
        responseCode = "201",
        description = "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check how muc the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 201 SUCCESS"
    )
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }
    @Operation(
            summary = "Name Enquiry",
            description = "Given an account number, check out the name"
    )
    @ApiResponse(
            responseCode = "202",
            description = "Http Status 201 CREATED"
    )
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }

    @Operation(
            summary = "Crediting a User's account",
            description = "Given an account number, credit the account"
    )
    @ApiResponse(
            responseCode = "203",
            description = "Http Status 203 SUCCESSFUL"
    )
    @PostMapping("credit")
    public BankResponse credit(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }
    @Operation(
            summary = "Debit a User's account",
            description = "Creating a new user and assigning an account ID and debiting their account"
    )
    @ApiResponse(
            responseCode = "204",
            description = "Http Status 204 CREATED"
    )
    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }
    @Operation(
            summary = "Transferring some amounts to another account",
            description = "Transferring some amounts "
    )
    @ApiResponse(
            responseCode = "2201",
            description = "Http Status 2201 TRANSFERRED"
    )
    @PostMapping("transfer")
    public BankResponse transferAccount(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }
}
