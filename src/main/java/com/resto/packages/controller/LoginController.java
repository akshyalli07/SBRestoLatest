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
@RequestMapping(value = "foody-sense/api/users")
public class LoginController {
    @Autowired
    UsersService usersService;

    @PostMapping(value = "create-user")
    public ResponseEntity<APIResponse> createUser(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        try {
            response.setResponse(usersService.createUser(reqBody));
            response.setMessage("Successfully Fetched Users");
            response.setSuccess(Boolean.TRUE);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setMessage("error occurred while fetching Users " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

}
