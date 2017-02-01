insert into country(name, capital, population, language, code) values ('Brazil', 'Brasila', 200000000, 'Portugues', 'BRA');
insert into country(name, capital, population, language, code) values ('United States', 'Washington DC', 310000000, 'English', 'USA');
insert into country(name, capital, population, language, code) values ('Japan', 'Tokyo', 150000000, 'Japanese', 'JPA');
insert into country(name, capital, population, language, code) values ('France', 'Paris', 200000000, 'French', 'FR');
insert into country(name, capital, population, language, code) values ('Italia', 'Rome', 300000000, 'Italian', 'ITA');

insert into users(username, password, enabled) values('user', '5f4dcc3b5aa765d61d8327deb882cf99', true);
insert into authorities(username, authority) values('user', 'ROLE_USER');

insert into users(username, password, enabled) values('admin', '21232f297a57a5a743894a0e4a801fc3', true);
insert into authorities(username, authority) values('admin', 'ROLE_ADMIN');