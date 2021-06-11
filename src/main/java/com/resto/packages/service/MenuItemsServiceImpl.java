package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.dao.MenuItemsRepository;
import com.resto.packages.entity.MenuItemsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MenuItemsServiceImpl implements MenuItemsService {

    @Autowired
    MenuItemsRepository menuItemsRepository;

    @Override
    public MenuItemsEntity addMenuItemsToRestaurant(JsonNode reqBody) throws Exception {

        MenuItemsEntity menuItems = new MenuItemsEntity();

        String restaurantId = reqBody.hasNonNull("restaurantId") ? reqBody.get("restaurantId").asText() : null;
        String categories = reqBody.hasNonNull("categories") ? reqBody.get("categories").asText() : null;
        String items = reqBody.hasNonNull("items") ? reqBody.get("items").asText() : null;

        MenuItemsEntity menuExists = menuItemsRepository.findByRestaurantId(restaurantId);

        if(menuExists != null){
            throw  new Exception();
        }

        menuItems.setRestaurantId(items);
        menuItems.setItems(items);
        menuItems.setCategories(categories);
        menuItems.setCreatedBy("system");
        menuItems.setCreatedDate(new Date());
        menuItems.setLastModifiedBy("system");
        menuItems.setLastModifiedDate(new Date());

        menuItemsRepository.save(menuItems);

        return menuItems;
    }

    @Override
    public Boolean updateMenuItemsOfRestaurant(JsonNode reqBody) throws Exception {

        String restaurantId = reqBody.hasNonNull("restaurantId") ? reqBody.get("restaurantId").asText() : null;
        String menuId = reqBody.hasNonNull("menuId") ? reqBody.get("menuId").asText() : null;
        String categories = reqBody.hasNonNull("categories") ? reqBody.get("categories").asText() : null;
        String items = reqBody.hasNonNull("items") ? reqBody.get("items").asText() : null;

        MenuItemsEntity menuExists = menuItemsRepository.findByRestaurantId(restaurantId);

        if(menuExists == null){
            throw  new Exception();
        }

        menuExists.setItems(items);
        menuExists.setCategories(categories);

        menuExists.setLastModifiedBy("system");
        menuExists.setLastModifiedDate(new Date());

        menuItemsRepository.save(menuExists);

        return true;
    }
}
