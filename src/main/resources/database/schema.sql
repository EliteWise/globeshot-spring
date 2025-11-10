CREATE TABLE Country (
 id bigint auto_increment primary key,
 name varchar(30) not null,
 flag_url varchar(200)
);

CREATE TABLE Client (
 id bigint auto_increment primary key,
 name varchar(30) not null,
 profile_pic_url varchar(200),
 password varchar(100) not null,
 email varchar(40) unique not null,

 country_id bigint,
 pictures_liked int,
 last_posted_picture_date timestamp,
 account_creation_date timestamp,
 last_update timestamp,
 foreign key (country_id) references Country(id)
 );

CREATE TABLE Picture (
  id bigint auto_increment primary key,
  url varchar(200) not null,
  country_id bigint,
  creation_date timestamp,
  foreign key (country_id) references Country(id)
 );

CREATE TABLE Comment (
  id bigint auto_increment primary key,
  text varchar(1000) not null,
  client_id bigint,
  picture_id bigint,
  creation_date timestamp,
  foreign key (picture_id) references Picture(id),
  foreign key (client_id) references Client(id)
 );
