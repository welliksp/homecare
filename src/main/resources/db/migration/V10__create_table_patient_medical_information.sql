CREATE TABLE patient_medical_information
(
    patient_id                BIGINT NOT NULL,
    medical_information_id BIGINT NOT NULL,

    PRIMARY KEY (patient_id, medical_information_id),
    FOREIGN KEY (patient_id) REFERENCES patient (id) ON DELETE CASCADE,
    FOREIGN KEY (medical_information_id) REFERENCES medical_information (id) ON DELETE CASCADE
);