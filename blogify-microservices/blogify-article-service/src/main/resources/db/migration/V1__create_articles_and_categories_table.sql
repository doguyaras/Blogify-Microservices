CREATE TABLE categories(
    id SERIAL NOT NULL PRIMARY KEY,
    categoryname varchar(255) NOT NULL
);

CREATE TABLE articles(
    id SERIAL NOT NULL PRIMARY KEY,
    title varchar(255) NOT NULL,
    content varchar(255) NOT NULL,
    categoryid BIGINT NOT NULL,
    userid BIGINT NOT NULL,
    creationdate DATE NOT NULL,
    updatedate DATE NOT NULL,
    FOREIGN KEY (categoryid) REFERENCES categories(id)
);

CREATE SEQUENCE categories_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999
    CYCLE;

CREATE SEQUENCE articles_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999
    CYCLE;