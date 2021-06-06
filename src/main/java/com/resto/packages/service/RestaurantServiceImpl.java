package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.dao.RestaurantInformationRepository;
import com.resto.packages.entity.RestaurantInformationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantInformationRepository restoRepo;


    @Override
    public RestaurantInformationEntity createRestaurant(JsonNode reqBody) throws Exception {

        RestaurantInformationEntity restoInfo = new RestaurantInformationEntity();

        String restaurantName = reqBody.hasNonNull("restaurantName") ? reqBody.get("restaurantName").asText() : null;
        String restaurantType = reqBody.hasNonNull("restaurantType") ? reqBody.get("restaurantType").asText() : null;
        String category = reqBody.hasNonNull("category") ? reqBody.get("category").asText() : null;
        int restaurantRating = reqBody.hasNonNull("restaurantRating") ? reqBody.get("restaurantRating").asInt() : null;

        int servingTime = reqBody.hasNonNull("servingTime") ? reqBody.get("servingTime").asInt() : null;
        String district = reqBody.hasNonNull("district") ? reqBody.get("district").asText() : null;
        String city = reqBody.hasNonNull("city") ? reqBody.get("city").asText() : null;
        String landmark = reqBody.hasNonNull("landmark") ? reqBody.get("landmark").asText() : null;
        String address = reqBody.hasNonNull("address") ? reqBody.get("address").asText() : null;
        Double priceForTwo = reqBody.hasNonNull("priceForTwo") ? reqBody.get("priceForTwo").asDouble() : null;
        String pincode = reqBody.hasNonNull("pincode") ? reqBody.get("pincode").asText() : null;

        RestaurantInformationEntity restoExists = restoRepo.findByRestaurantName(restaurantName);

        if(restoExists != null){
            throw  new Exception();
        }

        restoInfo.setRestaurantName(restaurantName);
        restoInfo.setRestaurantType(restaurantType);
        restoInfo.setCategory(category);
        restoInfo.setRestaurantRating(restaurantRating);
        restoInfo.setServingTime(servingTime);
        restoInfo.setAddress(address);
        restoInfo.setDistrict(district);
        restoInfo.setCity(city);
        restoInfo.setLandmark(landmark);
        restoInfo.setPriceForTwo(priceForTwo);
        restoInfo.setPincode(pincode);

        restoInfo.setCreatedBy("system");
        restoInfo.setCreatedDate(new Date());
        restoInfo.setLastModifiedBy("system");
        restoInfo.setLastModifiedDate(new Date());

        restoRepo.save(restoInfo);

        return restoInfo;
    }

    @Override
    public RestaurantInformationEntity loginToRestaurant(JsonNode reqBody) throws Exception {
        return null;
    }

    @Override
    public Boolean updateRestaurantDetails(JsonNode reqBody) throws Exception {

        RestaurantInformationEntity restoInfo = new RestaurantInformationEntity();

        String restaurantId = reqBody.hasNonNull("restaurantId") ? reqBody.get("restaurantId").asText() : null;
        String restaurantName = reqBody.hasNonNull("restaurantName") ? reqBody.get("restaurantName").asText() : null;
        String restaurantType = reqBody.hasNonNull("restaurantType") ? reqBody.get("restaurantType").asText() : null;
        String category = reqBody.hasNonNull("category") ? reqBody.get("category").asText() : null;
        int restaurantRating = reqBody.hasNonNull("restaurantRating") ? reqBody.get("restaurantRating").asInt() : null;

        int servingTime = reqBody.hasNonNull("servingTime") ? reqBody.get("servingTime").asInt() : null;
        String district = reqBody.hasNonNull("district") ? reqBody.get("district").asText() : null;
        String city = reqBody.hasNonNull("city") ? reqBody.get("city").asText() : null;
        String landmark = reqBody.hasNonNull("landmark") ? reqBody.get("landmark").asText() : null;
        String address = reqBody.hasNonNull("address") ? reqBody.get("address").asText() : null;
        Double priceForTwo = reqBody.hasNonNull("priceForTwo") ? reqBody.get("priceForTwo").asDouble() : null;
        String pincode = reqBody.hasNonNull("pincode") ? reqBody.get("pincode").asText() : null;

        restoInfo = restoRepo.findByRestaurantId(restaurantId);

        if(restoInfo == null){
            throw  new Exception();
        }

        restoInfo.setRestaurantName(restaurantName);
        restoInfo.setRestaurantType(restaurantType);
        restoInfo.setCategory(category);
        restoInfo.setRestaurantRating(restaurantRating);
        restoInfo.setServingTime(servingTime);
        restoInfo.setAddress(address);
        restoInfo.setDistrict(district);
        restoInfo.setCity(city);
        restoInfo.setLandmark(landmark);
        restoInfo.setPriceForTwo(priceForTwo);
        restoInfo.setPincode(pincode);

        restoInfo.setLastModifiedBy("system");
        restoInfo.setLastModifiedDate(new Date());

        restoRepo.save(restoInfo);

        return true;
    }
}
