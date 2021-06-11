package com.resto.packages.dao;

import com.resto.packages.entity.UserEntity;
import com.resto.packages.entity.UsersPersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersPersonalRepository extends JpaRepository<UsersPersonalEntity, String> {
    UsersPersonalEntity findByUserId(String id);

    Long deleteByUserId(String userId);

    Long deleteByPersonalId(String personalId);
}
