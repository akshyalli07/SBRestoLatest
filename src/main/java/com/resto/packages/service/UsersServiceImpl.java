package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.controller.ErrorCodes;
import com.resto.packages.dao.UsersRepository;
import com.resto.packages.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j

public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserEntity createUser(JsonNode reqBody) throws Exception {

        UserEntity userEntity = new UserEntity();
        ErrorCodes code = new ErrorCodes();

        String userName = reqBody.hasNonNull("userName") ? reqBody.get("userName").asText() : null;
        String firstName = reqBody.hasNonNull("firstName") ? reqBody.get("firstName").asText() : null;
        String lastName = reqBody.hasNonNull("lastName") ? reqBody.get("lastName").asText() : null;
        String dateOfBirth = reqBody.hasNonNull("dateOfBirth") ? reqBody.get("dateOfBirth").asText() : null;
        Date dob = null;
        if(dateOfBirth != null){
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
        }

        String gender = reqBody.hasNonNull("gender") ? reqBody.get("gender").asText() : null;
        String email = reqBody.hasNonNull("userEmail") ? reqBody.get("userEmail").asText() : null;
        String password = reqBody.hasNonNull("userPassword") ? reqBody.get("userPassword").asText() : null;
        String phoneNumber = reqBody.hasNonNull("phoneNumber") ? reqBody.get("phoneNumber").asText() : null;
        Boolean isActive = reqBody.hasNonNull("isActive") ? reqBody.get("isActive").asBoolean() : null;
        Boolean termsAndConditions = reqBody.hasNonNull("readTermsAndServices") ? reqBody.get("readTermsAndServices").asBoolean() : false;

//        List<UserEntity> userAlreadyExists = usersRepository.findByUserId(email);

        if(userName != null && email != null && password != null){

            UserEntity userExists = usersRepository.findByEmailId(email);

            if(userExists != null){
                code.setSuccessCode("302");
                throw new Exception();
//                return userExists;
            }

            userEntity.setUserName(userName);
            userEntity.setFirstName(firstName);
            userEntity.setLastName(lastName);
            userEntity.setDateOfBirth(dob);
            userEntity.setGender(gender);
            userEntity.setPhoneNumber(phoneNumber);
            userEntity.setIsActive(isActive);
            userEntity.setEmailId(email);
            userEntity.setPassword(password);
            userEntity.setTermsAndConditions(termsAndConditions);
            userEntity.setCreatedBy("system");
            userEntity.setCreatedDate(new Date());
            userEntity.setLastModifiedBy("system");
            userEntity.setLastModifiedDate(new Date());

            usersRepository.save(userEntity);

            code.setSuccessCode("302");

            return userEntity;
        }
        else{
            code.setErrorCode("500");
            throw new Exception();
        }
    }

    @Override
    public UserEntity loginUser(JsonNode reqBody) throws Exception {
        String email = reqBody.hasNonNull("userEmail") ? reqBody.get("userEmail").asText() : null;
        String password = reqBody.hasNonNull("userPassword") ? reqBody.get("userPassword").asText() : null;

        UserEntity loginUser = usersRepository.findByEmailIdAndPassword(email, password);
        if(loginUser == null ){
            log.error("User does not exists");
            throw new Exception();
        }

        return  loginUser;
    }

    @Override
    public Boolean updateUser(JsonNode reqBody) throws Exception {
        UserEntity userEntity = new UserEntity();

        String userName = reqBody.hasNonNull("userName") ? reqBody.get("userName").asText() : null;
        String firstName = reqBody.hasNonNull("firstName") ? reqBody.get("firstName").asText() : null;
        String lastName = reqBody.hasNonNull("lastName") ? reqBody.get("lastName").asText() : null;
        String dateOfBirth = reqBody.hasNonNull("dateOfBirth") ? reqBody.get("dateOfBirth").asText() : null;
        Date dob = null;
        if(dateOfBirth != null){
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
        }
        String password = reqBody.hasNonNull("userPassword") ? reqBody.get("userPassword").asText() : null;
        String gender = reqBody.hasNonNull("gender") ? reqBody.get("gender").asText() : null;
        String email = reqBody.hasNonNull("userEmail") ? reqBody.get("userEmail").asText() : null;
        String phoneNumber = reqBody.hasNonNull("phoneNumber") ? reqBody.get("phoneNumber").asText() : null;
        Boolean isActive = reqBody.hasNonNull("isActive") ? reqBody.get("isActive").asBoolean() : null;

        UserEntity userExists = usersRepository.findByEmailIdAndPassword(email, password);

        userEntity.setUserName(userName);
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setDateOfBirth(dob);
        userEntity.setGender(gender);
        userEntity.setPhoneNumber(phoneNumber);
        userEntity.setIsActive(isActive);
        userEntity.setEmailId(email);
        userEntity.setLastModifiedBy("system");
        userEntity.setLastModifiedDate(new Date());

        usersRepository.save(userExists);

        return true;
    }
}
