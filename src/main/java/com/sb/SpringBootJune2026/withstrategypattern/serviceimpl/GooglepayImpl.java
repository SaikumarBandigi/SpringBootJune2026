package com.sb.SpringBootJune2026.withstrategypattern.serviceimpl;


import com.sb.SpringBootJune2026.withstrategypattern.service.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class GooglepayImpl implements PaymentStrategy {

    @Override
    public String pay() {
        return "GooglepayImpl";
    }

}
