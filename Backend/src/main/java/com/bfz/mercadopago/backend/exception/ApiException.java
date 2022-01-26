package com.bfz.mercadopago.backend.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ApiException extends RuntimeException {

    private String message;
    private int code;

    public ApiException(String message, int code){
        super();
        this.message = message;
        this.code = code;
    }

}
