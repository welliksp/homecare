CREATE TABLE patient_address(
    patient_id BIGINT NOT NULL ,
    address_id BIGINT NOT NULL ,

    PRIMARY KEY (patient_id, address_id),
    FOREIGN KEY (patient_id) REFERENCES patient(id) ON DELETE CASCADE ,
    FOREIGN KEY (address_id) REFERENCES address(id) ON DELETE CASCADE
);