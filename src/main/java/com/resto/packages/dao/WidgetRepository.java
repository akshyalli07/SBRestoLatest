package com.resto.packages.dao;

import com.resto.packages.entity.WidgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends JpaRepository<WidgetEntity, String> {
    WidgetEntity findByWidgetKeyAndUserId(String widgetKey, String id);

    Long deleteByWidgetKey(String widgetKey);
}
