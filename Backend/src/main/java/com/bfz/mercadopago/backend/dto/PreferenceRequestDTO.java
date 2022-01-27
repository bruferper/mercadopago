package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PreferenceRequestDTO {

    private ItemRequestDTO item;
    private PayerRequestDTO payer;
    private PaymentMethodsRequestDTO paymentMethods;
    private BackUrlsRequestDTO backUrls;
    private String externalReference;

}
