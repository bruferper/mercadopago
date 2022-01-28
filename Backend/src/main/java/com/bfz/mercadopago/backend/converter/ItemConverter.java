package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.ItemRequestDTO;
import com.mercadopago.resources.datastructures.preference.Item;

public class ItemConverter extends AbstractConverter<Item, ItemRequestDTO, ItemRequestDTO>{

    @Override
    public Item fromRequestToEntity(ItemRequestDTO r) {
        if(r == null) return null;
        Item item = new Item();
        item.setId(r.getId());
        item.setTitle(r.getTitle());
        item.setDescription(r.getDescription());
        item.setPictureUrl(r.getPictureUrl());
        item.setQuantity(r.getQuantity());
        item.setUnitPrice(r.getUnitPrice());
        return item;
    }

    @Override
    public ItemRequestDTO fromEntityToResponse(Item item) {
        return null;
    }

}
