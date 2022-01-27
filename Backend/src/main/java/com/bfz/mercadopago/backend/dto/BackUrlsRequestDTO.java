package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BackUrlsRequestDTO {

    private String success;
    private String pending;
    private String failure;

}
