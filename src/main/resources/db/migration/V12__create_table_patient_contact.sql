CREATE TABLE patient_contact
(
    patient_id                BIGINT NOT NULL,
    contact_id BIGINT NOT NULL,

    PRIMARY KEY (patient_id, contact_id),
    FOREIGN KEY (patient_id) REFERENCES patient (id) ON DELETE CASCADE,
    FOREIGN KEY (contact_id) REFERENCES contact (id) ON DELETE CASCADE
);