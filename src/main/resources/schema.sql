create table country(
	id identity,
	name varchar(255) not null,
	capital varchar(255) not null,
	population bigint not null,
	language varchar(100) not null,
	code varchar(5) not null
);
