package com.bfz.mercadopago.backend.converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<E, Req, Res> {

    public abstract E fromRequestToEntity(Req r);
    public abstract Res fromEntityToResponse(E e);

    public List<E> fromRequestToEntity(List<Req> listRequest){
        if(listRequest == null) return null;
        List<E> listEntity = new ArrayList<E>();
        for (Req r: listRequest) {
            listEntity.add(fromRequestToEntity(r));
        }
        return listEntity;
    }

    public List<Res>  fromEntityToResponse(List<E> listEntity){
        if(listEntity == null) return null;
        List<Res> listResponse = new ArrayList<Res>();
        for (E e : listEntity) {
            listResponse.add(fromEntityToResponse(e));
        }
        return listResponse;
    }

}
