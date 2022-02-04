package com.bfz.mercadopago.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationRequestDTO {

    private String id;
    private boolean live_mode;
    private String type;
    private String date_created;
    private String application_id;
    private String user_id;
    private String version;
    private String api_version;
    private String action;
    private NotificationDataDTO data;

}
