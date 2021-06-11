package com.resto.packages.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@Slf4j
@RequestMapping(value = "api/v1/users")
public class UserController {
    @Autowired
    UsersService usersService;

    //Sign up
    @PostMapping(value = "create-user")
    public ResponseEntity<APIResponse> createUser(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(usersService.createUser(reqBody));
            response.setMessage("Successfully Created User");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while creating User " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

//    Login
    @PostMapping(value = "login-user")
    public ResponseEntity<APIResponse> loginUser(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(usersService.loginUser(reqBody));
            response.setMessage("Successfully Fetched User");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setSuccessCode(code.getErrorCode());
            response.setMessage("error occurred while fetching User " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

//    update users
    @PostMapping(value = "update-user")
    public ResponseEntity<APIResponse> updateUser(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(usersService.updateUser(reqBody));
            response.setMessage("Successfully Updated User");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setSuccessCode(code.getErrorCode());
            response.setMessage("error occurred while updating User " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
