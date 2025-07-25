
    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table customer (
        reward_points integer not null,
        customer_id char(36) not null,
        city varchar(255) not null,
        date_added varchar(255) not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        phone varchar(255) not null,
        state varchar(255) not null,
        street_address varchar(255) not null,
        zip_code varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table item (
        item_id integer not null auto_increment,
        price decimal(8,2) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table login (
        customer_id varchar(255) not null,
        password_hash varchar(255) not null,
        user_name varchar(255) not null,
        primary key (customer_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null,
        order_status_id integer,
        order_date datetime(6) not null,
        customer_id char(36),
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer not null,
        order_item_id integer not null auto_increment,
        quantity integer not null,
        notes varchar(255),
        primary key (order_item_id)
    ) engine=InnoDB;

    create table order_status (
        order_id integer not null auto_increment,
        order_status_id integer,
        notes varchar(255),
        primary key (order_id)
    ) engine=InnoDB;

    alter table order 
       add constraint UKsfp1db79f4aj8di6tp37yn1wr unique (order_status_id);

    alter table order_item 
       add constraint UKflndste1vbvdfb200b4ikibis unique (item_id);

    alter table order_status 
       add constraint UK1dq9enrjx5qk3n5gvpnec9syn unique (order_status_id);

    alter table order 
       add constraint FKb8tboo4d95mh8gavvovwbb7vg 
       foreign key (customer_id) 
       references customer (customer_id);

    alter table order 
       add constraint FK7q0wbceok1b5pmnnesq7p91h5 
       foreign key (order_status_id) 
       references order_status (order_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table order_status 
       add constraint FK9176xrsxm3gydcbvuyl6y3792 
       foreign key (order_status_id) 
       references order_status (order_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);

    create table item (
        item_category_id integer,
        item_id integer not null auto_increment,
        unit_price decimal(38,2) not null,
        end_date datetime(6) not null,
        start_date datetime(6) not null,
        item_description varchar(255) not null,
        item_name varchar(255) not null,
        primary key (item_id)
    ) engine=InnoDB;

    create table item_category (
        item_category_id integer not null auto_increment,
        item_category_name varchar(255) not null,
        primary key (item_category_id)
    ) engine=InnoDB;

    create table order (
        order_id integer not null auto_increment,
        server_id integer,
        sub_total decimal(9,2) not null,
        tax decimal(9,2) not null,
        tip decimal(9,2) not null,
        total decimal(9,2) not null,
        order_date datetime(6) not null,
        primary key (order_id)
    ) engine=InnoDB;

    create table order_item (
        item_id integer,
        order_id integer,
        order_item_id integer not null auto_increment,
        price decimal(9,2) not null,
        quantity integer not null,
        primary key (order_item_id)
    ) engine=InnoDB;

    create table payment (
        amount decimal(9,2) not null,
        order_id integer,
        payment_id integer not null auto_increment,
        payment_type_id integer,
        primary key (payment_id)
    ) engine=InnoDB;

    create table payment_type (
        payment_type_id integer not null auto_increment,
        payment_type_name varchar(255) not null,
        primary key (payment_type_id)
    ) engine=InnoDB;

    create table server (
        server_id integer not null auto_increment,
        hire_date datetime(6) not null,
        term_date datetime(6),
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (server_id)
    ) engine=InnoDB;

    create table tax (
        tax_id integer not null auto_increment,
        tax_percentage decimal(9,2) not null,
        end_date datetime(6),
        start_date datetime(6) not null,
        primary key (tax_id)
    ) engine=InnoDB;

    alter table item 
       add constraint FKasph99xmslm0pmfyyc8ga2iyr 
       foreign key (item_category_id) 
       references item_category (item_category_id);

    alter table order 
       add constraint FK8gmicdlk8pb8jony4r2ucvvg6 
       foreign key (server_id) 
       references server (server_id);

    alter table order_item 
       add constraint FKija6hjjiit8dprnmvtvgdp6ru 
       foreign key (item_id) 
       references item (item_id);

    alter table order_item 
       add constraint FKt6wv8m7eshksp5kp8w4b2d1dm 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FK458pu56xefty15ugupb46wrin 
       foreign key (order_id) 
       references order (order_id);

    alter table payment 
       add constraint FKkvolsaw3e4jg4ra05vu135cj9 
       foreign key (payment_type_id) 
       references payment_type (payment_type_id);
