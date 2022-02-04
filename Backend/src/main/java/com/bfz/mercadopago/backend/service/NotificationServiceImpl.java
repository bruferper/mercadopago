package com.bfz.mercadopago.backend.service;

import com.bfz.mercadopago.backend.dto.NotificationRequestDTO;
import com.bfz.mercadopago.backend.exception.ApiException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadopago.MercadoPago;
import com.mercadopago.resources.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationServiceImpl implements INotificationService {

    @Override
    public void printToJson(NotificationRequestDTO notification) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(notification);
            log.info("Notificación de pago recibida:");
            log.info(json);
        } catch (JsonProcessingException e) {
            log.info(e.getLocalizedMessage());
            throw new ApiException("Error al parsear la notificación a JSON.", 400);
        }
    }

}
