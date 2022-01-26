package com.bfz.mercadopago.backend.controller;

import com.bfz.mercadopago.backend.converter.PreferenceConverter;
import com.bfz.mercadopago.backend.dto.PreferenceRequestDTO;
import com.bfz.mercadopago.backend.dto.PreferenceResponseDTO;
import com.bfz.mercadopago.backend.service.IPreferenceService;
import com.bfz.mercadopago.backend.utils.ResponseWrapper;
import com.mercadopago.resources.Preference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/preferences")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Slf4j
public class PreferenceController {

    private final IPreferenceService preferenceService;
    private final PreferenceConverter preferenceConverter;

    @PostMapping
    public ResponseEntity<ResponseWrapper<PreferenceResponseDTO>> create(@RequestBody PreferenceRequestDTO request) {
        Preference preference = preferenceService.createPreference(preferenceConverter.fromRequestToEntity(request));
        ResponseWrapper<PreferenceResponseDTO> response = new ResponseWrapper<>(HttpStatus.OK.value(), "Preferencia creada con éxito.", preferenceConverter.fromEntityToResponse(preference));
        return response.createResponse(HttpStatus.OK);
    }

}
