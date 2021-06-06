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
@Table(name = "restaurant_info")
@Getter
@Setter

public class RestaurantInformationEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "restaurant_id", nullable = false)
    private String restaurantId;

    @Column(name = "restaurant_name", nullable = false)
    private String restaurantName;

    @ColumnTransformer(read = "UNCOMPRESS(category)", write = "COMPRESS(?)")
    @Column(name = "category", columnDefinition = "LONGBLOB")
    private String category;

    @Column(name = "restaurant_type")
    private String restaurantType;

    @Column(name = "restaurant_rating")
    private int restaurantRating;

    @Column(name = "serving_time")
    private int servingTime;

    @Column(name = "price_for_two")
    private Double priceForTwo;

    @ColumnTransformer(read = "UNCOMPRESS(address)", write = "COMPRESS(?)")
    @Column(name = "address", columnDefinition = "LONGBLOB")
    private String address;

    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @ColumnTransformer(read = "UNCOMPRESS(landmark)", write = "COMPRESS(?)")
    @Column(name = "landmark", columnDefinition = "LONGBLOB")
    private String landmark;

    @Column(name = "pincode")
    private String pincode;

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
