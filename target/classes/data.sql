create table person(
    id integer not null,
    name varchar(255),
    location varchar(255),
    birthday timestamp,
    primary key(id)
);

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTHDAY)
VALUES(10001, 'Tony', 'Perth', sysdate());
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTHDAY)
VALUES(10002, 'Balaji', 'Perth', sysdate());
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTHDAY)
VALUES(10003, 'Cosmin', 'Perth', sysdate());