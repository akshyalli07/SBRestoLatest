package com.resto.packages.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "users")
@Getter
@Setter

public class UsersPersonalEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "personal_id", nullable = false)
    private String personalId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false, columnDefinition = "LONGBLOB")
    private String address;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "landmark", nullable = false, columnDefinition = "LONGBLOB")
    private String landmark;

    @Column(name = "pincode", nullable = false)
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
