create database balance;

create table balances (id INT AUTO_INCREMENT PRIMARY KEY, account_id varchar(255), amount DECIMAL(10, 2), created_at TIMESTAMP);