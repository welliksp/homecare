CREATE TABLE contact
(
    id           BIGINT       NOT NULL AUTO_INCREMENT,
    name         VARCHAR(255) NOT NULL,
    relationship VARCHAR(100) NOT NULL,
    phone        VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id)
);