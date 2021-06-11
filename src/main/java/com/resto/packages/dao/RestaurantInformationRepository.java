package com.resto.packages.dao;

import com.resto.packages.entity.RestaurantInformationEntity;
import com.resto.packages.entity.UsersPersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantInformationRepository extends JpaRepository<RestaurantInformationEntity, String> {
    RestaurantInformationEntity findByRestaurantId(String RestaurantId);

    RestaurantInformationEntity findByRestaurantNameAndPincode(String restaurantName, String pincode);

    Long deleteByRestaurantId(String RestaurantId);

    RestaurantInformationEntity findByRestaurantName(String restaurantName);

}
