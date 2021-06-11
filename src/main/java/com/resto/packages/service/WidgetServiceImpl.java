package com.resto.packages.service;

import com.resto.packages.dao.WidgetRepository;
import com.resto.packages.entity.WidgetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WidgetServiceImpl implements WidgetService{

    @Autowired
    WidgetRepository widgetRepository;

    @Override
    public void saveWidgetData(String widgetKey, String widgetData, String id)throws Exception {

        WidgetEntity widgetExists = widgetRepository.findByWidgetKeyAndUserId(widgetKey, id);

        if(widgetExists == null ){
            WidgetEntity widgetEntity = new WidgetEntity();

            widgetEntity.setWidgetKey(widgetKey);
            widgetEntity.setUserId(id);
            widgetEntity.setWidgetData(widgetData);
            widgetEntity.setCreatedBy("system");
            widgetEntity.setCreatedDate(new Date());
            widgetEntity.setLastModifiedBy("system");
            widgetEntity.setLastModifiedDate(new Date());

            widgetRepository.save(widgetEntity);
        }
        else{
            widgetExists.setWidgetData(widgetData);
            widgetExists.setLastModifiedBy("system");
            widgetExists.setLastModifiedDate(new Date());
            widgetRepository.save(widgetExists);
        }

    }

    @Override
    public WidgetEntity getWidgetData(String widgetKey, String id) throws Exception {
        WidgetEntity widgetExists = widgetRepository.findByWidgetKeyAndUserId(widgetKey, id);

        if(widgetExists == null){
            throw new Exception();
        }

        return widgetExists;
    }
}
