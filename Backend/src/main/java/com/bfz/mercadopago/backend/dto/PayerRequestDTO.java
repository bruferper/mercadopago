package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayerRequestDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String areaCode;
    private String phoneNumber;
    private String streetName;
    private int streetNumber;
    private String zipCode;

}
