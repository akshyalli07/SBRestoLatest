package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.entity.UserEntity;

import java.util.List;

public interface UsersService {
    public UserEntity createUser(JsonNode reqBody) throws Exception;

    public UserEntity loginUser(JsonNode reqBody) throws Exception;

    public Boolean updateUser(JsonNode reqBody) throws Exception;
}
