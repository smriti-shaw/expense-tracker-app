drop schema `expense_tracker` ;
CREATE SCHEMA `expense_tracker` ;
use expense_tracker;

create table user_personalisation(
user_id  int(11) unsigned auto_increment primary key,
mobile_no varchar(30),
user_name varchar(30),
email varchar(255),
date_of_creation datetime default current_timestamp
);

create table user_auth(
user_id varchar(30) primary key,
password varchar(30));

create table expenses(
Id int(11) unsigned auto_increment primary key,
user_id int(11) unsigned,
additional_details varchar(255),
date_of_creation datetime,
amount double,
foreign key (user_id)
references user_personalisation(user_id)
ON DELETE CASCADE
);


insert into user_auth(mobile_no , password) values (9886431234 , 'password');
insert into user_personalisation(mobile_no, user_name, date_of_creation, email) values (9886431234 , 'smriti', '2019-07-11', 'test@test.com');
insert into expenses(user_id , additional_details, date_of_creation, amount) values (1, 'addiddotnal details', '2019-08-13', 122.9);

select * from expenses;
