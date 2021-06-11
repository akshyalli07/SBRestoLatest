package com.resto.packages.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.service.MenuItemsService;
import com.resto.packages.service.WidgetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600)
@Slf4j

@RequestMapping(value = "api/v1/widget")

public class WidgetController {
    @Autowired
    WidgetService widgetService;

    @PostMapping(value = "/{widgetKey}/{userId}")
    public ResponseEntity<APIResponse> saveWidgetData(@PathVariable String widgetKey,
                                                                @PathVariable String userId,
                                                                @RequestBody String reqBody){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            widgetService.saveWidgetData(widgetKey, userId, reqBody);
            response.setMessage("Successfully saved the widget");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while saving the widget" + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping(value = "/{widgetKey}/{userId}")
    public ResponseEntity<APIResponse> getWidgetData(@PathVariable String widgetKey,
                                                      @PathVariable String userId){
        APIResponse response = new APIResponse();
        ErrorCodes code = new ErrorCodes();
        try {
            response.setResponse(widgetService.getWidgetData(widgetKey, userId));
            response.setMessage("Successfully fetched the widget");
            response.setSuccess(Boolean.TRUE);
            response.setSuccessCode(code.getSuccessCode());
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setSuccess(Boolean.FALSE);
            response.setErrorCode(code.getErrorCode());
            response.setMessage("error occurred while fetching the widget" + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

}
