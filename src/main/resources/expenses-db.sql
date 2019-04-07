<-- Create schema for expenses -->
CREATE SCHEMA `expense_tracker` ;

<-- table for user personalisation -->
create table user_personalisation(
UserId  int(6) unsigned auto_increment primary key,
MobileNo varchar(30),
UserName varchar(30),
DateOfCreation timestamp default current_timestamp
);

create table user_auth(
MobileNo varchar(30) primary key,
Password varchar(30));

create table expenses(
Id int(6) unsigned auto_increment primary key,
UserId int(6),
AdditionalDetails varchar(60),
DateOfCreation timestamp,
Amount decimal
);
