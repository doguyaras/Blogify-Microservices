CREATE TYPE role_enum AS ENUM ('ADMIN', 'EDITOR', 'AUTHOR', 'READER');

CREATE TABLE roles (
    id SERIAL NOT NULL PRIMARY KEY,
    role role_enum NOT NULL
);

CREATE TABLE users
(
    id SERIAL PRIMARY KEY,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    firstname varchar(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    address varchar(255) NOT NULL,
    roleid BIGINT NOT NULL,
    FOREIGN KEY (roleid) REFERENCES roles(id)
);

CREATE SEQUENCE users_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999
    CYCLE;

CREATE SEQUENCE roles_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999
    CYCLE;
