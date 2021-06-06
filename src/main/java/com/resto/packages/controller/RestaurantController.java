package com.resto.packages.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@Slf4j
@RequestMapping(value = "api/v1/restaurant")

public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value = "create-restaurant")
    public ResponseEntity<APIResponse> createRestaurant(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(restaurantService.createRestaurant(reqBody));
            response.setMessage("Successfully Created restaurant");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while creating restaurant " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping(value = "login-restaurant")
    public ResponseEntity<APIResponse> loginToRestaurant(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(restaurantService.loginToRestaurant(reqBody));
            response.setMessage("Successfully login to restaurant");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while login to restaurant " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping(value = "update-restaurant")
    public ResponseEntity<APIResponse> updateRestaurantDetails(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(restaurantService.updateRestaurantDetails(reqBody));
            response.setMessage("Successfully Updated restaurant");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while Updating restaurant\"" + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
