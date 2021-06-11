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
@Table(name = "menu_items")
@Getter
@Setter
public class MenuItemsEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "menu_id", nullable = false)
    private String menuId;

    @Column(name = "restaurant_id", nullable = false)
    private String restaurantId;

    @ColumnTransformer(read = "UNCOMPRESS(categories)", write = "COMPRESS(?)")
    @Column(name = "categories", nullable = false, columnDefinition = "LONGBLOB")
    private String categories;

    @ColumnTransformer(read = "UNCOMPRESS(items)", write = "COMPRESS(?)")
    @Column(name = "items", nullable = false, columnDefinition = "LONGBLOB")
    private String items;

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
