package com.bfz.mercadopago.backend.config;

import com.bfz.mercadopago.backend.converter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfig {

    @Bean
    public PreferenceConverter getPreferenceConverter(){
        return new PreferenceConverter(getBackUrlsConverter(), getItemConverter(), getPayerConverter(), getPaymentMethodsConverter());
    }

    @Bean
    public BackUrlsConverter getBackUrlsConverter(){
        return new BackUrlsConverter();
    }

    @Bean
    public ItemConverter getItemConverter(){
        return new ItemConverter();
    }

    @Bean
    public PayerConverter getPayerConverter(){
        return new PayerConverter();
    }

    @Bean
    public PaymentMethodsConverter getPaymentMethodsConverter(){
        return new PaymentMethodsConverter();
    }

}
