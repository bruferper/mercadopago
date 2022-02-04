package com.bfz.mercadopago.backend.converter;

import com.bfz.mercadopago.backend.dto.PaymentMethodsRequestDTO;
import com.mercadopago.resources.datastructures.preference.ExcludedPaymentMethod;
import com.mercadopago.resources.datastructures.preference.ExcludedPaymentType;
import com.mercadopago.resources.datastructures.preference.PaymentMethods;
import java.util.ArrayList;

public class PaymentMethodsConverter extends AbstractConverter<PaymentMethods, PaymentMethodsRequestDTO, PaymentMethodsRequestDTO> {

    @Override
    public PaymentMethods fromRequestToEntity(PaymentMethodsRequestDTO r) {
        if(r == null) return null;
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.setExcludedPaymentMethods(this.getExcludedPaymentsMethods(r.getExcludedPaymentMethods()));
        paymentMethods.setExcludedPaymentTypes(this.getExcludedPaymentsTypes(r.getExcludedPaymentTypes()));
        paymentMethods.setInstallments(r.getInstallments());
        return paymentMethods;
    }

    @Override
    public PaymentMethodsRequestDTO fromEntityToResponse(PaymentMethods paymentMethods) {
        return null;
    }

    private ArrayList<ExcludedPaymentMethod> getExcludedPaymentsMethods(String[] payments){
        ArrayList<ExcludedPaymentMethod> expmList = new ArrayList<ExcludedPaymentMethod>();
        for(String payment : payments){
            ExcludedPaymentMethod expm = new ExcludedPaymentMethod().setId(payment);
            expmList.add(expm);
        }
        return expmList;
    }

    private ArrayList<ExcludedPaymentType> getExcludedPaymentsTypes(String[] payments){
        ArrayList<ExcludedPaymentType> exptList = new ArrayList<ExcludedPaymentType>();
        for(String payment : payments){
            ExcludedPaymentType expt = new ExcludedPaymentType().setId(payment);
            exptList.add(expt);
        }
        return exptList;
    }

}
