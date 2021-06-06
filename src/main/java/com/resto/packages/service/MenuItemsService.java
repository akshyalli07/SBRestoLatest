package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.entity.MenuItemsEntity;

public interface MenuItemsService {
    public MenuItemsEntity addMenuItemsToRestaurant(JsonNode reqBody) throws Exception;

    public Boolean updateMenuItemsOfRestaurant(JsonNode reqBody) throws Exception;
}
