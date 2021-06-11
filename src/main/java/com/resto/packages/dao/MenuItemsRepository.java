package com.resto.packages.dao;

import com.resto.packages.entity.MenuItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemsRepository extends JpaRepository<MenuItemsEntity, String> {
    MenuItemsEntity findByMenuId(String menuId);

    MenuItemsEntity findByRestaurantId(String restaurantId);
}
