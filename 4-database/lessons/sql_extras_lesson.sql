drop database if exists simple_banking;
create database simple_banking;
use simple_banking;

CREATE TABLE account (
	account_id INT PRIMARY KEY AUTO_INCREMENT,
	account_name VARCHAR(256) NOT NUll,
    balance DECIMAL(10,2) NOT NULL DEFAULT 0
);

CREATE TABLE transfer (
	transfer_id INT PRIMARY KEY AUTO_INCREMENT,
    withdraw_account_id INT NOT NULL,
    deposit_account_id INT NOT NULL,
    transfer_amount DECIMAL(10,2),
    transfer_time DATETIME NOT NULL,
    
    CONSTRAINT fk_transfer_withdraw_account_id FOREIGN KEY (withdraw_account_id) REFERENCES account(account_id),
    CONSTRAINT fk_transfer_deposit_account_id FOREIGN KEY (deposit_account_id) REFERENCES account(account_id)
);

CREATE TABLE transaction (
	transaction_id INT PRIMARY KEY AUTO_INCREMENT,
    account_id INT NOT NULL,
    transaction_amount DECIMAL(10,2) NOT NULL,
	transaction_time DATETIME NOT NULL,
    CONSTRAINT fk_transaction_account_id FOREIGN KEY (account_id) REFERENCES account(account_id)
);

INSERT INTO account values
(NULL, "CHECKING", 1000),
(NULL, "SAVINGS", 0),
(NULL, "BUISNESS", 10000);

-- ------------------------- LESSON START ------------------------- --
 
-- STORED PROCEDURES
-- example of a simple stored procedure that doesn't take any parameters
CREATE PROCEDURE get_high_value_accounts()
	SELECT * 
    FROM account
    WHERE balance >= 10000;
        
-- example of having multiple queries in one stored procedure requiring you to set a new DELIMETER
-- example of using a using a parameter
-- inserts a new account into the account table and shows the new entry with a select statement
DELIMITER $$;
CREATE PROCEDURE add_new_account(account_name_param VARCHAR(256))    
	BEGIN
	INSERT INTO account(account_name) values (account_name_param);
	SELECT * FROM account WHERE account_name = account_name_param;
    END $$;
DELIMITER ;

-- stored procedure to deposit money into an account
DELIMITER $$;
CREATE PROCEDURE add_transaction(account_id_param INT, transaction_amount_param DECIMAL(10,2))
BEGIN
	 -- setting the value of the current_balance variable
	IF transaction_amount_param > 0 OR current_balance + transaction_amount_param >= 0 THEN
		INSERT INTO transaction values (NULL, account_id_param, transaction_amount_param, NOW());
        UPDATE account SET balance = balance + transaction_amount_param WHERE account_id = account_id_param;
        SET row_count = ROW_COUNT();
        IF row_count = 0 THEN
			ROLLBACK;
		ELSE
			COMMIT;
		END IF;
	END IF;
END $$;
DELIMITER ;

-- create random transactions for the last 30 days
DELIMITER $$
CREATE PROCEDURE generate_transactions()
BEGIN
  DECLARE i INT DEFAULT 1;
  WHILE i <= 250 DO
    INSERT INTO transaction (account_id, transaction_amount, transaction_time)
    VALUES (MOD(i, 3) + 1, ROUND(RAND() * 500, 2), NOW() - INTERVAL FLOOR(RAND() * 30) DAY );
    SET i = i + 1;
  END WHILE;
END $$
DELIMITER ;

-- CALL keyword to use a stored procedure
CALL get_high_value_accounts();
CALL add_new_account("JOINT CHECKING");
CALL add_transaction(1, -999);
CALL generate_transactions();


-- TRANSACTION 

START TRANSACTION; 
	INSERT INTO transfer VALUES(NULL, 3, 1, 500, NOW());
	SELECT * FROM transfer;
	UPDATE account SET balance = balance - 500 WHERE account_id = 7;
	SELECT * FROM account WHERE account_id = 3;
	UPDATE account SET balance = balance + 500 WHERE account_id = 1;
	SELECT * FROM account WHERE account_id = 1;
COMMIT;

START TRANSACTION; 
	INSERT INTO transfer VALUES(NULL, 3, 1, 500, NOW());
	SELECT * FROM transfer;
	UPDATE account SET balance = balance - 500 WHERE account_id = 3;
	SELECT * FROM account WHERE account_id = 3;
	UPDATE account SET balance = balance + 500 WHERE account_id = 1;
	SELECT * FROM account WHERE account_id = 1;
ROLLBACK;


select * from transfer;
select * from transaction;
select * From account;
CALL add_transaction(77, 777.77);
select * from transaction ORDER BY transaction_time DESC;


-- CREATE PROCEDURE add_transfer
-- It should take 3 parameters withdraw_account_id, deposit_account_id, amount
-- update the withdraw/deposit accounts to reflect the new balances and create an entry in the transfer table
DELIMITER $$;
CREATE PROCEDURE add_transfer(withdraw_account_id INT, deposit_account_id INT, amount DECIMAL(10,2))
BEGIN
DECLARE row_count INT DEFAULT 0;
	DECLARE current_balance DECIMAL(10,2) DEFAULT 0;
    START TRANSACTION;
	SELECT balance INTO current_balance FROM account WHERE account_id = withdraw_account_id; 
    IF amount > 0 AND current_balance >= amount THEN
    	INSERT INTO transfer values (NULL, withdraw_account_id, deposit_account_id, amount, NOW());
        UPDATE account SET balance = balance - amount WHERE account_id = withdraw_account_id;
        UPDATE account SET balance = balance + amount WHERE account_id = deposit_account_id;
        SET row_count = ROW_COUNT();
        IF row_count = 0 THEN
			ROLLBACK;
		ELSE
			COMMIT;
		END IF;
	END IF;
END $$;
DELIMITER ;

CALL 