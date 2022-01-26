package com.bfz.mercadopago.backend.utils;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseWrapper<T> {

    public int status;
    public String message;
    public T body;

    public ResponseEntity<ResponseWrapper<T>> createResponse(HttpStatus status){
        return new ResponseEntity<>(this, status);
    }

}
