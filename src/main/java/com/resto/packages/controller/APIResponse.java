package com.resto.packages.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIResponse<T> {
    private T response;

    private boolean success = true;

    private String errorCode;

    private String message;
}
