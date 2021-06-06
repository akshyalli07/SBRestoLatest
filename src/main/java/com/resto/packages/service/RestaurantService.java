package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.entity.RestaurantInformationEntity;

public interface RestaurantService {
    public RestaurantInformationEntity createRestaurant(JsonNode reqBody) throws Exception;

    public RestaurantInformationEntity loginToRestaurant(JsonNode reqBody) throws Exception;

    public Boolean updateRestaurantDetails(JsonNode reqBody) throws Exception;
}
