package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayerRequestDTO {

    private String name;
    private String surname;
    private String email;
    private String areaCode;
    private String phoneNumber;
    private String streetName;
    private String buildingNumber;
    private String zipCode;

}
