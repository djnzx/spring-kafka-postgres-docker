create table person
(
    id bigserial not null
        constraint table1_pk
            primary key,
    name text,
    salary integer not null
);

INSERT INTO person (id, name, salary) VALUES (1, 'Jim', 10000);
INSERT INTO person (id, name, salary) VALUES (2, 'Alex', 20000);
INSERT INTO person (id, name, salary) VALUES (3, 'Sergio', 23000);
