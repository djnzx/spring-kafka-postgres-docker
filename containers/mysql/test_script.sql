create table person
(
    id bigint auto_increment
        primary key,
    name text not null,
    salary int not null
);

INSERT INTO person (id, name, salary) VALUES (1, 'Jim', 10000);
INSERT INTO person (id, name, salary) VALUES (2, 'Alex', 20000);
INSERT INTO person (id, name, salary) VALUES (3, 'Sergio', 23000);
