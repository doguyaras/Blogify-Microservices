CREATE TABLE comments(
    id SERIAL NOT NULL PRIMARY KEY,
    content varchar(255) NOT NULL,
    creationdate DATE NOT NULL,
    articleid BIGINT NOT NULL,
    userid BIGINT NOT NULL
);

CREATE SEQUENCE comments_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999
    CYCLE;