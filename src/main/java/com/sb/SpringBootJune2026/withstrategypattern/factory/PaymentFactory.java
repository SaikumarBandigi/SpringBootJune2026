package com.sb.SpringBootJune2026.withstrategypattern.factory;


import com.sb.SpringBootJune2026.withstrategypattern.service.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactory {

    Map<String, PaymentStrategy> paymentStrategies;

    public PaymentFactory(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public PaymentStrategy getPaymentStrategy(String whatPayment) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(whatPayment);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException();
        }
        return paymentStrategy;
    }


}
