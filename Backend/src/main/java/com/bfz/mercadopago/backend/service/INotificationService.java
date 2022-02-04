package com.bfz.mercadopago.backend.service;

import com.bfz.mercadopago.backend.dto.NotificationRequestDTO;

public interface INotificationService {

    void printToJson(NotificationRequestDTO notification);

}
