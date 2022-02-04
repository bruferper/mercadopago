package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentMethodsRequestDTO {

    private String[] excludedPaymentMethods;
    private String[] excludedPaymentTypes;
    private int installments;

}
