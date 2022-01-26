package com.bfz.mercadopago.backend.config;

import com.bfz.mercadopago.backend.converter.PreferenceConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfig {

    @Bean
    public PreferenceConverter getPreferenceConverter(){
        return new PreferenceConverter();
    }

}
