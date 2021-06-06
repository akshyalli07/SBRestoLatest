package com.resto.packages.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "widget")
@Getter
@Setter

public class WidgetEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "widget_id", nullable = false)
    private String widgetId;

    @Column(name = "widget_key", nullable = false)
    private String widgetKey;

    @ColumnTransformer(read = "UNCOMPRESS(widget_data)", write = "COMPRESS(?)")
    @Column(name = "widget_data", nullable = false, columnDefinition = "LONGBLOB")
    private String widgetData;

    @CreatedBy
    @Basic
    @Column(name = "CREATED_BY", updatable = false, nullable = false)
    private String createdBy;

    @CreatedDate
    @Basic
    @Column(name = "CREATED_ON", updatable = false, nullable = false)
    private Date createdDate;

    @LastModifiedBy
    @Basic
    @Column(name = "LAST_UPDATED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Basic
    @Column(name = "LAST_UPDATED_ON")
    private Date lastModifiedDate;
}
