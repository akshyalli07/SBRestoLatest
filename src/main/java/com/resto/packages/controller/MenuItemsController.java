package com.resto.packages.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.service.MenuItemsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600)
@Slf4j

@RequestMapping(value = "api/v1/menu-items")

public class MenuItemsController {

    @Autowired
    MenuItemsService menuItemsService;

    @PostMapping(value = "add-items")
    public ResponseEntity<APIResponse> addMenuItemsToRestaurant(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(menuItemsService.addMenuItemsToRestaurant(reqBody));
            response.setMessage("Successfully Added Menu Items to restaurant");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while adding menu items to restaurant " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping(value = "update-items")
    public ResponseEntity<APIResponse> updateMenuItemsOfRestaurant(@RequestBody JsonNode reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(menuItemsService.updateMenuItemsOfRestaurant(reqBody));
            response.setMessage("Successfully updated menu items of restaurant");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while updating menu items of restaurant " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
