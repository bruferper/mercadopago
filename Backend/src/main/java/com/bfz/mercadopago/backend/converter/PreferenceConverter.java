package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.PreferenceRequestDTO;
import com.bfz.mercadopago.backend.dto.PreferenceResponseDTO;
import com.mercadopago.resources.Preference;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PreferenceConverter extends AbstractConverter<Preference, PreferenceRequestDTO, PreferenceResponseDTO>{

    private final BackUrlsConverter backUrlsConverter;
    private final ItemConverter itemConverter;
    private final PayerConverter payerConverter;
    private final PaymentMethodsConverter paymentMethodsConverter;

    @Override
    public Preference fromRequestToEntity(PreferenceRequestDTO r) {
        if(r == null) return null;
        Preference preference = new Preference();
        preference.setBackUrls(backUrlsConverter.fromRequestToEntity(r.getBackUrls()));
        preference.appendItem(itemConverter.fromRequestToEntity(r.getItem()));
        preference.setPayer(payerConverter.fromRequestToEntity(r.getPayer()));
        preference.setPaymentMethods(paymentMethodsConverter.fromRequestToEntity(r.getPaymentMethods()));
        preference.setExternalReference(r.getExternalReference());
        preference.setAutoReturn(Preference.AutoReturn.approved);
        preference.setBinaryMode(true);
        return preference;
    }

    @Override
    public PreferenceResponseDTO fromEntityToResponse(Preference e) {
        if(e == null) return null;
        return PreferenceResponseDTO.builder()
                .id(e.getId())
                .initPoint(e.getInitPoint())
                .sandboxInitPoint(e.getSandboxInitPoint())
                .build();
    }

}
