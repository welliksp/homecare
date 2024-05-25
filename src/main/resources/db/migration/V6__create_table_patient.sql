CREATE TABLE patient
(
    id             BIGINT       NOT NULL AUTO_INCREMENT,
    fullname       VARCHAR(255) NOT NULL,
    gender         VARCHAR(50)  NOT NULL,
    marital_status VARCHAR(50)  NOT NULL,
    nationality    VARCHAR(100) NOT NULL,
    cpf            VARCHAR(20)  NOT NULL,
    rg             VARCHAR(20)  NOT NULL,
    sus_card       VARCHAR(20),
    created_at DATETIME     NOT NULL,
    update_at  DATETIME     NULL,
    PRIMARY KEY (id)
);