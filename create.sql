
    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        district varchar(255) not null,
        landmark LONGBLOB not null,
        pincode varchar(255) not null,
        type varchar(255),
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        district varchar(255) not null,
        landmark LONGBLOB not null,
        pincode varchar(255) not null,
        type varchar(255),
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        district varchar(255) not null,
        landmark LONGBLOB not null,
        pincode varchar(255) not null,
        type varchar(255),
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table d860ggrvs7bbqh.users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        primary key (user_id)
    )

    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        district varchar(255) not null,
        first_name varchar(255),
        landmark LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        pincode varchar(255) not null,
        type varchar(255),
        user_id varchar(255) not null,
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table d860ggrvs7bbqh.users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        primary key (user_id)
    )

    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        district varchar(255) not null,
        first_name varchar(255),
        landmark LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        pincode varchar(255) not null,
        type varchar(255),
        user_id varchar(255) not null,
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table d860ggrvs7bbqh.users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        primary key (user_id)
    )

    create table menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

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

    create table users (
       personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        district varchar(255) not null,
        first_name varchar(255),
        landmark LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        pincode varchar(255) not null,
        type varchar(255),
        user_id varchar(255) not null,
        primary key (personal_id)
    )

    create table widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )

    create table d860ggrvs7bbqh.menu_items (
       menu_id varchar(255) not null,
        categories LONGBLOB not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        items LONGBLOB not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        restaurant_id varchar(255) not null,
        primary key (menu_id)
    )

    create table d860ggrvs7bbqh.restaurant_info (
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

    create table d860ggrvs7bbqh.users (
       user_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        date_of_birth timestamp,
        email_id varchar(255) not null,
        first_name varchar(255) not null,
        gender varchar(255),
        is_active boolean not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        last_name varchar(255),
        password varchar(255) not null,
        phone_number varchar(255),
        terms_and_conditions boolean,
        user_name varchar(255) not null,
        personal_id varchar(255) not null,
        address LONGBLOB,
        city varchar(255) not null,
        district varchar(255) not null,
        landmark LONGBLOB not null,
        pincode varchar(255) not null,
        type varchar(255),
        primary key (personal_id)
    )

    create table d860ggrvs7bbqh.widget (
       widget_id varchar(255) not null,
        created_by varchar(255) not null,
        created_on timestamp not null,
        last_updated_by varchar(255),
        last_updated_on timestamp,
        user_id varchar(255) not null,
        widget_data LONGBLOB not null,
        widget_key varchar(255) not null,
        primary key (widget_id)
    )
