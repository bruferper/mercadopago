package com.bfz.mercadopago.backend.exception;

import com.bfz.mercadopago.backend.utils.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ResponseWrapper<Object>> handleException(Exception e){

        if(e instanceof ApiException){
            ApiException apiException = (ApiException) e;
            ResponseWrapper<Object> response = new ResponseWrapper<>(apiException.getCode(), apiException.getMessage(), null);
            return response.createResponse(HttpStatus.valueOf(apiException.getCode()));
        } else {
            log.error(e.getClass().toString());
            log.error(e.getMessage());
            e.printStackTrace();
            ResponseWrapper<Object> response = new ResponseWrapper<>(500, "Error general en la aplicación. Verificar logs.", null);
            return response.createResponse(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
