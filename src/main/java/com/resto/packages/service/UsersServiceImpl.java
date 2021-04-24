package com.resto.packages.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.resto.packages.dao.UsersRepository;
import com.resto.packages.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j

public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Object createUser(JsonNode reqBody) throws Exception {

        UserEntity userEntity = new UserEntity();

        String userName = reqBody.hasNonNull("userName") ? reqBody.get("userName").asText() : null;
        String email = reqBody.hasNonNull("userEmail") ? reqBody.get("userEmail").asText() : null;
        String password = reqBody.hasNonNull("userPassword") ? reqBody.get("userPassword").asText() : null;
        Boolean termsAndConditions = reqBody.hasNonNull("readTermsAndServices") ? reqBody.get("readTermsAndServices").asBoolean() : false;

        List<UserEntity> userAlreadyExists = usersRepository.findByUserId(email);

        if(userName != null && email != null && password != null){
            userEntity.setUserName(userName);
            userEntity.setEmailId(email);
            userEntity.setPassword(password);
            userEntity.setTermsAndConditions(termsAndConditions);
            userEntity.setCreatedBy("system");
            userEntity.setCreatedDate(new Date());
            userEntity.setLastModifiedBy(email);
            userEntity.setLastModifiedDate(new Date());

            usersRepository.save(userEntity);
        }
        else{
            throw new Exception();
        }

        return userEntity;
    }
}
