package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;

public interface UsersService {
    public Object createUser(JsonNode reqBody) throws Exception;
}
