CREATE DATABASE Conference;


use  Conference;

CREATE TABLE tb_user 
(
  
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);


