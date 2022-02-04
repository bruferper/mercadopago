package com.bfz.mercadopago.backend.controller;

import com.bfz.mercadopago.backend.dto.NotificationRequestDTO;
import com.bfz.mercadopago.backend.service.INotificationService;
import com.bfz.mercadopago.backend.utils.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Slf4j
public class NotificationController {

    private final INotificationService notificationService;

    @PostMapping
    public ResponseEntity<ResponseWrapper<String>> create(@RequestBody NotificationRequestDTO request) {
        notificationService.printToJson(request);
        ResponseWrapper<String> response = new ResponseWrapper<>(HttpStatus.OK.value(), "Notificación recibida con éxito.", null);
        return response.createResponse(HttpStatus.OK);
    }

}
