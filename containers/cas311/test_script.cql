create keyspace space3 with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

create table space3.person
(
    id bigint primary key,
    name text,
    salary double
)
    with caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
        and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold': '32', 'min_threshold': '4'}
        and compression = {'chunk_length_in_kb': '64', 'class': 'org.apache.cassandra.io.compress.LZ4Compressor'}
        and dclocal_read_repair_chance = 0.1;

INSERT INTO space3.person (id, name, salary) VALUES (1, 'Jim', 10000);
INSERT INTO space3.person (id, name, salary) VALUES (2, 'Alex', 20000);
INSERT INTO space3.person (id, name, salary) VALUES (3, 'Sergio', 23000);
