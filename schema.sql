
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
