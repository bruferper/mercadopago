package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.PreferenceRequestDTO;
import com.bfz.mercadopago.backend.dto.PreferenceResponseDTO;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.Item;

public class PreferenceConverter extends AbstractConverter<Preference, PreferenceRequestDTO, PreferenceResponseDTO>{

    @Override
    public Preference fromRequestToEntity(PreferenceRequestDTO r) {
        if(r == null) return null;
        Preference p = new Preference();
        Item item = new Item();
        item.setTitle(r.getTitle()).setQuantity(r.getQuantity()).setUnitPrice(r.getPrice());
        p.appendItem(item);
        return p;
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
