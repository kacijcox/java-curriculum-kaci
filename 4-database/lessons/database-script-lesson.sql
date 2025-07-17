-- ADD and DROP tables and schemas 
-- define the names and datatypes of table columns
-- know the important keywords when defining columns
-- ALTER and UPDATE tables

DROP DATABASE IF EXISTS field_agent;

-- CREATE DATABASE are the keywords to create a new database/schema
CREATE DATABASE field_agent;
USE field_agent;

-- use CREATE TABLE to create a new table for the specific schema
CREATE TABLE agency (
	agency_id INT PRIMARY KEY AUTO_INCREMENT,
    short_name VARCHAR(25) NOT NULL,
    long_name VARCHAR(256) NOT NULL DEFAULT "secret actually"
);
-- DROP a table 
-- DROP TABLE IF EXISTS agency;
ALTER TABLE agency
ALTER long_name SET DEFAULT "Not So Secret";


-- adding a table with a foreign key relationship to agency
CREATE TABLE location (
	location_id INT PRIMARY KEY AUTO_INCREMENT,
    location_name VARCHAR(25) NOT NULL,
    city VARCHAR(50) NOT NULL,
    country_code VARCHAR(5) NOT NULL,
    agency_id INT NOT NULL,
    
    CONSTRAINT fk_location_agency_id FOREIGN KEY (agency_id) REFERENCES agency(agency_id) ON DELETE CASCADE -- if a related agency_id is deleted, then this cascade will remove any locations with this foreign key
);

CREATE TABLE agent (
	agent_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    middle_name VARCHAR(30),
    date_of_birth DATE
);
    
-- creating a bridge table to map the many to many relationship betweeen an agent and agency
CREATE TABLE agency_agent (
	agency_id INT NOT NULL,
    agent_id INT NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    identifier VARCHAR(50) NOT NULL,
    
    -- defining a composite primary key for this table
    CONSTRAINT pk_agency_agent PRIMARY KEY (agency_id, agent_id),
    
    -- foreign key constraints 
    CONSTRAINT fk_agency_agent_agency_id FOREIGN KEY (agency_id) REFERENCES agency(agency_id),
    CONSTRAINT fk_agency_agent_agent_id FOREIGN KEY (agent_id) REFERENCES agent(agent_id),
    
    -- constraint to enforce a unique identifier/agency_id relationship
    CONSTRAINT uq_agent_identifier_agency_id UNIQUE(identifier, agency_id)
);

CREATE TABLE alias (
	alias_uuid CHAR(36) PRIMARY KEY, -- example of how to structure a column to hold a UUID
    alias_name VARCHAR(256) NOT NULL,
    persona VARCHAR(2048),
    agent_id INT NOT NULL,
    
	CONSTRAINT fk_alias_agent_id FOREIGN KEY (agent_id) REFERENCES agent(agent_id)
);


-- INSERT UPDATE DELETE operations in sql 

INSERT INTO agency (short_name, long_name) VALUES ("FBI", "Federal Bureau of Investigation");
INSERT INTO agency (short_name) VALUES ("WHOOHP");
INSERT INTO agency (short_name) VALUES ("SPECTRE");
INSERT INTO agency (short_name, long_name) VALUES ("CIA", "Central Intelligence Agency");

select * from agency;

INSERT INTO location (location_name, city, country_code, agency_id) VALUES ("CIA House", "Washington DC", "USA", 3);

select * from location;

-- INSERT without specifying columns
INSERT INTO agent VALUES 
(NULL, "Matt", "Damon", "Paige", "1970-10-08"),
(NULL, "Pierce", "Brosnan", NULL, "1953-05-16"),
(NULL, "James", "Bond", NULL, "1936-01-03");

select DATE_FORMAT(date_of_birth, "%Y") from agent;

-- UPDATE rows in tables
-- UPDATE agency SET long_name = "Cool Investigators of America"  --!! this would update every entry in the agency table

UPDATE agency SET long_name = "Cool Investigators of America" WHERE agency_id = 4;

select * from agency;

UPDATE agency SET short_name = "W.H.O.O.H.P.", long_name = 'Spies from France' WHERE agency_id = 2;


-- DELETE row from a table 
-- DELETE FROM agent WHERE agent_id = 2;
SELECT * FROM agent;
DELETE FROM agency WHERE short_name = "CIA";