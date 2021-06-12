create table users(
	user_id varchar(255),
    user_name varchar(255) not null,
    first_name varchar(255) not null,
    last_name varchar(255),
    date_of_birth date,
    gender varchar(15),
    email_id varchar(30) not null,
    password varchar(12) not null,
    created_by varchar(50) not null,
    created_on date not null,
    last_updated_by varchar(255) not null,
    last_updated_on date not null,
    terms_and_conditions boolean not null,
    phone_number varchar(15),
    is_active boolean not null,
    PRIMARY KEY (user_id)
);