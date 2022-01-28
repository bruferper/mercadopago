package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.PaymentMethodsRequestDTO;
import com.mercadopago.resources.datastructures.preference.ExcludedPaymentMethod;
import com.mercadopago.resources.datastructures.preference.PaymentMethods;
import java.util.ArrayList;

public class PaymentMethodsConverter extends AbstractConverter<PaymentMethods, PaymentMethodsRequestDTO, PaymentMethodsRequestDTO> {

    @Override
    public PaymentMethods fromRequestToEntity(PaymentMethodsRequestDTO r) {
        if(r == null) return null;
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.setExcludedPaymentMethods(this.getExcludedPayments(r.getExcludedPaymentMethods()));
        paymentMethods.setInstallments(r.getInstallments());
        return paymentMethods;
    }

    @Override
    public PaymentMethodsRequestDTO fromEntityToResponse(PaymentMethods paymentMethods) {
        return null;
    }

    private ArrayList<ExcludedPaymentMethod> getExcludedPayments(String[] payments){
        ArrayList<ExcludedPaymentMethod> expmList = new ArrayList<ExcludedPaymentMethod>();
        for(String payment : payments){
            ExcludedPaymentMethod expm = new ExcludedPaymentMethod().setId(payment);
            expmList.add(expm);
        }
        return expmList;
    }

}
