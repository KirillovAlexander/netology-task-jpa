CREATE TABLE IF NOT EXISTS persons
(
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          int         not null,
    phone_number varchar(20),
    city_of_living varchar(30),
    primary key (name, surname, age)
);
