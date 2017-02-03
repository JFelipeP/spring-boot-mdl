insert into country(name, capital, population, language, code) values ('Brazil', 'Brasila', 200000000, 'Portuguese', 'BR');
insert into country(name, capital, population, language, code) values ('United States', 'Washington, D.C.', 310000000, 'English', 'USA');
insert into country(name, capital, population, language, code) values ('Japan', 'Tokyo', 127000000, 'Japanese', 'JP');
insert into country(name, capital, population, language, code) values ('France', 'Paris', 200000000, 'French', 'FR');
insert into country(name, capital, population, language, code) values ('Italy', 'Rome', 60000000, 'Italian', 'IT');

insert into users(username, password, enabled) values('user', '$2a$06$XODO9mgM4shtjA98BUhgDOachRH/pQn78TXHQvv7FNY/GWZ67FQKO', true);
insert into authorities(username, authority) values('user', 'ROLE_USER');

insert into users(username, password, enabled) values('admin', '$2a$06$8tmQRqk2pRpb7KP3BXvdq.NJI6dJF5zHe8tbZkcbBmK6g5QY0WG3.', true);
insert into authorities(username, authority) values('admin', 'ROLE_ADMIN');
