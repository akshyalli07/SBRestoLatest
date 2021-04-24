package com.resto.packages.dao;

import com.resto.packages.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, String> {
    List<UserEntity> findByUserId(String id);

    List<UserEntity> findByEmailId(String emailId);

}
