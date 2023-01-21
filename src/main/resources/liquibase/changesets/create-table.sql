CREATE TABLE IF NOT EXISTS logs(
    id serial PRIMARY KEY,
    time timestamp NOT NULL,
    type varchar(20) NOT NULL,
    level varchar(10) NOT NULL,
    message varchar(512) NOT NULL
);