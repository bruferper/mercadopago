package com.bfz.mercadopago.backend.service;

import com.bfz.mercadopago.backend.exception.ApiException;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.mercadopago.MercadoPago;

@Service
@Slf4j
public class PreferenceServiceImpl implements IPreferenceService {

    @Value("${mercadopago.access_token}")
    private String accessToken;

    @Override
    public Preference createPreference(Preference preference) {
        try{
            MercadoPago.SDK.setAccessToken(this.accessToken);
            preference.save();
            if(preference.getId() == null) throw new ApiException("Error al crear la preferencia. Datos nulos.", 400);
            return preference;
        } catch (MPConfException e){
            log.error(e.getMessage());
            throw new ApiException("Error en la configuración de MercadoPago. Verificar logs.", 400);
        } catch (MPException e) {
            log.error(e.getMessage());
            throw new ApiException("Error al crear la preferencia. Verificar logs.", 400);
        }
    }

}
