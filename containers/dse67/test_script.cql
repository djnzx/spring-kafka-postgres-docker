create keyspace space67 with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

create table space67.person
(
    id bigint primary key,
    name text,
    salary double
);

INSERT INTO space67.person (id, name, salary) VALUES (1, 'Jim', 10000);
INSERT INTO space67.person (id, name, salary) VALUES (2, 'Alex', 20000);
INSERT INTO space67.person (id, name, salary) VALUES (3, 'Sergio', 23000);
