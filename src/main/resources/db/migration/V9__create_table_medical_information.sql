CREATE TABLE medical_information
(
    id                      BIGINT       NOT NULL AUTO_INCREMENT,
    allergies               VARCHAR(255) NOT NULL ,
    pre_existing_conditions VARCHAR(200) NOT NULL ,
    medications             VARCHAR(250) NOT NULL,
    surgical_history        VARCHAR(250) NOT NULL,
    family_medical_history  VARCHAR(250) NOT NULL,
    vaccinations            VARCHAR(250) NOT NULL,
    created_at              DATETIME     NOT NULL,
    update_at               DATETIME     NULL,
    PRIMARY KEY (id)
);