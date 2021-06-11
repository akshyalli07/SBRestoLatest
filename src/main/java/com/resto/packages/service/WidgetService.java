package com.resto.packages.service;

import com.resto.packages.entity.WidgetEntity;

public interface WidgetService {
    public void saveWidgetData(String widgetKey, String widgetData, String id) throws Exception;

    public WidgetEntity getWidgetData(String widgetKey, String id) throws Exception;

}
