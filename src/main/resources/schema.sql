DROP TABLE IF EXISTS ACCOUNT;
 
CREATE TABLE ACCOUNT (
  account_id INT AUTO_INCREMENT  PRIMARY KEY,
  account_name VARCHAR(250) NOT NULL,
  account_mob VARCHAR(250) NOT NULL,
  account_email VARCHAR(250) NOT NULL,
  account_number VARCHAR(250) NOT NULL,
  current_balance INT NOT NULL
);


DROP TABLE IF EXISTS TRANSATION;
 
CREATE TABLE TRANSATION (
  transaction_id INT AUTO_INCREMENT  PRIMARY KEY,
  from_account VARCHAR(250) NOT NULL,
  to_account VARCHAR(250) NOT NULL,
  transaction_amount INT NOT NULL,
  transaction_datetime VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS USER;
CREATE TABLE USER (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  user_surname VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  pincode INT NOT NULL,
  phonenumber VARCHAR(250) NOT NULL,
  vehicle_model VARCHAR(250) NOT NULL,
  cycle_code VARCHAR(250) NOT NULL,
  battery_code VARCHAR(250) NOT NULL,
  rfid_code VARCHAR(250) NOT NULL,
  rcpt_no VARCHAR(250) NOT NULL,
  date_of_purchase VARCHAR(250) NOT NULL,
  amount VARCHAR(250) NOT NULL,
  gst_No VARCHAR(250) NOT NULL,
  dis_cod VARCHAR(250) NOT NULL,
  mode_of_sale VARCHAR(250) NOT NULL,
  warrenty_det VARCHAR(250) NOT NULL,
  complain_no VARCHAR(250) NOT NULL,
  last_service VARCHAR(250) NOT NULL,
  subscription_date VARCHAR(250) NOT NULL,
  last_date_of_subscription VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS RFID;
CREATE TABLE RFID (
  rfid_id INT AUTO_INCREMENT  PRIMARY KEY,
  rfid_num VARCHAR(250) NOT NULL,
  rfid_code VARCHAR(250) NOT NULL,
  model VARCHAR(250) NOT NULL,
  vendor_code VARCHAR(250) NOT NULL,
  lot_number VARCHAR(250) NOT NULL,
  date_of_purchase INT NOT NULL,
  date_of_issue VARCHAR(250) NOT NULL,
  status VARCHAR(250) NOT NULL,
  user_code VARCHAR(250) NOT NULL,
  bike_code VARCHAR(250) NOT NULL
);




CREATE TABLE `lekeamp`.`station_master` ( `station_id` INT(11) NOT NULL , `station_name` VARCHAR(255) NOT NULL , `station_identity` VARCHAR(255) NOT NULL , `station_address` VARCHAR(500) NOT NULL , `battery_count` INT(11) NOT NULL , PRIMARY KEY (`station_id`(11))) ENGINE = InnoDB;


CREATE TABLE `lekeamp`.`battery_master` ( `battery_id` INT(11) NOT NULL , `station_id` INT(11) NOT NULL , `battery_id` VARCHAR(255) NOT NULL , `battery_voltage` VARCHAR(255) NOT NULL , PRIMARY KEY (`battery_id`)) ENGINE = InnoDB;


CREATE TABLE `lekeamp`.`battery_transaction` ( `transaction_id` INT(11) NOT NULL AUTO_INCREMENT , `user_id` INT(11) NOT NULL , `station_id` INT(11) NOT NULL , `battery_id` INT(11) NOT NULL , `battery_voltage` VARCHAR(255) NOT NULL , `transaction_date` TIMESTAMP NOT NULL , PRIMARY KEY (`transaction_id`)) ENGINE = InnoDB;

ALTER TABLE battery_master ADD CONSTRAINT fk_foreign_station_id FOREIGN KEY (station_id) REFERENCES station_master(station_id)
