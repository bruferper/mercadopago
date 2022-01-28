package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.BackUrlsRequestDTO;
import com.mercadopago.resources.datastructures.preference.BackUrls;

public class BackUrlsConverter extends AbstractConverter<BackUrls, BackUrlsRequestDTO, BackUrlsRequestDTO>{

    @Override
    public BackUrls fromRequestToEntity(BackUrlsRequestDTO r) {
        if(r == null) return null;
        BackUrls backUrls = new BackUrls();
        backUrls.setSuccess(r.getSuccess());
        backUrls.setPending(r.getPending());
        backUrls.setFailure(r.getFailure());
        return backUrls;
    }

    @Override
    public BackUrlsRequestDTO fromEntityToResponse(BackUrls backUrls) {
        return null;
    }

}
