package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.PayerRequestDTO;
import com.mercadopago.resources.datastructures.preference.Address;
import com.mercadopago.resources.datastructures.preference.Payer;
import com.mercadopago.resources.datastructures.preference.Phone;

public class PayerConverter extends AbstractConverter<Payer, PayerRequestDTO, PayerRequestDTO>{

    @Override
    public Payer fromRequestToEntity(PayerRequestDTO r) {
        if(r == null) return null;
        Payer payer = new Payer();
        payer.setName(r.getFirstName());
        payer.setSurname(r.getLastName());
        payer.setEmail(r.getEmail());
        payer.setPhone(
                new Phone()
                .setNumber(r.getPhoneNumber())
                .setAreaCode(r.getAreaCode())
        );
        payer.setAddress(
                new Address()
                .setStreetName(r.getStreetName())
                .setStreetNumber(r.getStreetNumber())
                .setZipCode(r.getZipCode()));
        return payer;
    }

    @Override
    public PayerRequestDTO fromEntityToResponse(Payer payer) {
        return null;
    }
}
