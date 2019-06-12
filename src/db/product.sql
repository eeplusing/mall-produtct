create database db_products default charset utf8;

create table products (pid int not null primary key auto_increment, pname varchar(200), type varchar(200), price double, createBy varchar(200), createTime timestamp, updateBy varchar(200), updateTime timestamp, enableStatus int);

