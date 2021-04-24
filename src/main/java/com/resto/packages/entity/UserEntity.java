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
public class UserEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "TermsAndConditions", nullable = false)
    private Boolean termsAndConditions;

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
