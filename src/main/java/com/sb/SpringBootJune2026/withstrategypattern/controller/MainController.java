package com.sb.SpringBootJune2026.withstrategypattern.controller;

import com.sb.SpringBootJune2026.withstrategypattern.service.PaymentService;
import com.sb.SpringBootJune2026.withstrategypattern.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {


    @Autowired
    private RecommendationService service;

    @GetMapping("/getRecommendation")
    public List<String> getRecommendation(@RequestParam String user, @RequestParam String userType) {
        return service.recommend(user, userType);
    }


    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getPayment")
    public String getPayment(@RequestParam String whatPayment) {
        return paymentService.getWhatPayment(whatPayment);
    }


}
