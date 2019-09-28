package pl.rlechowicz.sklep.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistrationDto {

    private String email;

    private String passwordA;

    private String passwordB;

    private String firstname;

    private String lastname;

    private String phone;

    private String address;

    private String city;

    private String postalCode;

}
