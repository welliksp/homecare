package br.com.wsp.homecare.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private Long id;

    @NotNull
    @NotEmpty
    private String street;

    @NotNull
    @NotEmpty
    private String number;

    @NotNull
    @NotEmpty
    private String complement;

    @NotNull
    @NotEmpty
    private String neighborhood;

    @NotNull
    @NotEmpty
    private String city;

    @NotNull
    @NotEmpty
    private String state;

    @NotNull
    @NotEmpty
    private String postalCode;

    @NotNull
    @NotEmpty
    private String country;
}