package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemRequestDTO {

    private String id;
    private String title;
    private String description;
    private String pictureUrl;
    private int quantity;
    private float unitPrice;

}
