package br.com.wsp.homecare.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "medical_information")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Medical_Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "allergies", nullable = false, length = 255)
    private String allergies;

    @Column(name = "pre_existing_conditions", nullable = false, length = 200)
    private String preExistingConditions;

    @Column(name = "medications", nullable = false, length = 250)
    private String medications;

    @Column(name = "surgical_history", nullable = false, length = 250)
    private String surgicalHistory;

    @Column(name = "family_medical_history", nullable = false, length = 250)
    private String familyMedicalHistory;

    @Column(name = "vaccinations", nullable = false, length = 250)
    private String vaccinations;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
}