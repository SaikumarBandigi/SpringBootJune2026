package com.sb.SpringBootJune2026.withstrategypattern.service;


import com.sb.SpringBootJune2026.withstrategypattern.factory.PaymentFactory;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public String getWhatPayment(String whatPayment) {
        PaymentStrategy paymentStrategy = paymentFactory.getPaymentStrategy(whatPayment);
        return paymentStrategy.pay();
    }


}
