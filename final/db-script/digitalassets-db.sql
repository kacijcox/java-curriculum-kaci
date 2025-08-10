DROP DATABASE IF EXISTS digitalassets;
CREATE DATABASE digitalassets;

USE digitalassets;


CREATE TABLE `user` (
user_id VARCHAR(25) PRIMARY KEY NOT NULL,
password_hash TEXT NOT NULL
);

CREATE TABLE coin_list (
id VARCHAR(25) PRIMARY KEY,
symbol VARCHAR(25) NOT NULL,
`name` VARCHAR(25) NOT NULL,
user_id VARCHAR(25),

constraint fk_coin_list_user_id 
foreign key (user_id)
references `user` (user_id)
-- https://docs.coingecko.com/reference/coins-list
);

CREATE TABLE coin_price (
id VARCHAR(25) PRIMARY KEY,
usd INT NOT NULL,
usd_market_cap INT NOT NULL,
usd_24h_vol INT NOT NULL,
usd_24h_change INT NOT NULL,
last_updated_at DATE NOT NULL,
user_id VARCHAR(25),

constraint fk_coin_price_user_id 
foreign key (user_id)
references `user` (user_id)

-- https://docs.coingecko.com/reference/simple-price
);

CREATE TABLE historical_data (
id VARCHAR(25) PRIMARY KEY,
symbol VARCHAR(25) NOT NULL,
`name` VARCHAR(25) NOT NULL,
market_data INT NOT NULL,
current_price INT NOT NULL,
market_cap INT NOT NULL,
total_volume INT NOT NULL,
user_id VARCHAR(25),

constraint fk_historical_data_user_id 
foreign key (user_id)
references `user` (user_id)

-- https://docs.coingecko.com/reference/coins-id-history
);

CREATE TABLE market_ranking (
id VARCHAR(25) PRIMARY KEY,
symbol VARCHAR(25) NOT NULL,
`name` VARCHAR(25) NOT NULL,
current_price INT NOT NULL,
market_cap INT NOT NULL,
market_cap_rank INT NOT NULL,
fully_diluted_valuation INT NOT NULL,
total_volume INT NOT NULL,
high_24h INT NOT NULL,
low_24h INT NOT NULL,
user_id VARCHAR(25) NOT NULL,

constraint fk_market_ranking_user_id 
foreign key (user_id)
references `user` (user_id)

);
