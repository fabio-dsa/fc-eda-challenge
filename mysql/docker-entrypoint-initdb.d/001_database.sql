create database if not exists `wallet`;
create database if not exists `balance`;

create table wallet.clients (id varchar(255), name varchar(255), email varchar(255), created_at date);
create table wallet.accounts (id varchar(255), client_id varchar(255), balance int, created_at date);
create table wallet.transactions (id varchar(255), account_id_from varchar(255), account_id_to varchar(255), amount int, created_at date);

create table balance.balances (id int AUTO_INCREMENT primary key, account_id varchar(255), amount decimal(10, 2), created_at timestamp);