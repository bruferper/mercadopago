package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PreferenceResponseDTO {

    private String id;
    private String initPoint;
    private String sandboxInitPoint;

}