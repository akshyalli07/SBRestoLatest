--create table users(
--	user_id varchar(255),
--    user_name varchar(255) not null,
--    first_name varchar(255) not null,
--    last_name varchar(255),
--    date_of_birth date,
--    gender varchar(15),
--    email_id varchar(30) not null,
--    password varchar(12) not null,
--    created_by varchar(50) not null,
--    created_on date not null,
--    last_updated_by varchar(255) not null,
--    last_updated_on date not null,
--    terms_and_conditions boolean not null,
--    phone_number varchar(15),
--    is_active boolean not null,
--    PRIMARY KEY (user_id)
--);

create table restaurant_info (
       restaurant_id varchar(255) not null,
        address LONGBLOB,
        category LONGBLOB,
        city varchar(255),
        created_by varchar(255) not null,
        created_on timestamp not null,
        district varchar(255),
        landmark LONGBLOB,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        pincode varchar(255),
        price_for_two float8,
        restaurant_name varchar(255) not null,
        restaurant_rating int4,
        restaurant_type varchar(255),
        serving_time int4,
        primary key (restaurant_id)
    )