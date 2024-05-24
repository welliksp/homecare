CREATE TABLE address
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    street       VARCHAR(255) NOT NULL,
    number       VARCHAR(50)  NOT NULL,
    complement   VARCHAR(255),
    neighborhood VARCHAR(255) NOT NULL,
    city         VARCHAR(255) NOT NULL,
    state        VARCHAR(255) NOT NULL,
    postal_code  VARCHAR(20)  NOT NULL,
    country      VARCHAR(255) NOT NULL,
    created_at   DATETIME     NOT NULL,
    update_at    DATETIME     NULL,
    user_id      BIGINT,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);