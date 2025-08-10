
    create table coin_price (
        usd integer not null,
        usd_24h_change integer not null,
        usd_24h_vol integer not null,
        usd_market_cap integer not null,
        last_updated_at datetime(6) not null,
        id varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;
