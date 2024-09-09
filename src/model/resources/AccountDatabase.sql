create table if not exists USERS (
        id identity primary key,
        username varchar(255) not null,
        password varchar(255) not null,
        firstName varchar(255) not null,
        lastName varchar(255) not null,
        cardNumber int not null,
        balance double not null
        );
truncate table USERS;
insert into USERS (username, password, firstName, lastName, cardNumber, balance) values
('sarahsmith', 'pass123','Sarah', 'Smith', '123456789','10.00');
insert into USERS (name) values ('jimboneutron', '321word', 'Hugh', 'Neutron', '098765432', '40.00');