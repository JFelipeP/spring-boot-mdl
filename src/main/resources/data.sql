insert into country(name, capital, population, language, code) values ('Brazil', 'Brasila', 200000000, 'Portugues', 'BRA');
insert into country(name, capital, population, language, code) values ('United States', 'Washington DC', 310000000, 'English', 'USA');
insert into country(name, capital, population, language, code) values ('Japan', 'Tokyo', 150000000, 'Japanese', 'JPA');
insert into country(name, capital, population, language, code) values ('France', 'Paris', 200000000, 'French', 'FR');
insert into country(name, capital, population, language, code) values ('Italia', 'Rome', 300000000, 'Italian', 'ITA');

insert into users(username, password, enabled) values('user', '$2a$06$XODO9mgM4shtjA98BUhgDOachRH/pQn78TXHQvv7FNY/GWZ67FQKO', true);
insert into authorities(username, authority) values('user', 'ROLE_USER');

insert into users(username, password, enabled) values('admin', '$2a$06$8tmQRqk2pRpb7KP3BXvdq.NJI6dJF5zHe8tbZkcbBmK6g5QY0WG3.', true);
insert into authorities(username, authority) values('admin', 'ROLE_ADMIN');