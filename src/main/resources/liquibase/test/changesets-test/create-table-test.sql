CREATE TABLE IF NOT EXISTS logs(
    id serial PRIMARY KEY,
    time timestamp,
    type varchar(20),
    level varchar(10),
    message varchar(512)
);