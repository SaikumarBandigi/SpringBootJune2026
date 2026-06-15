package com.sb.SpringBootJune2026.junitTut.controller;

import com.sb.SpringBootJune2026.junitTut.service.CalculatorService;

public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    public int getSum(int a, int b) {
        return service.add(a, b);
    }

    public int getMultiply(int a, int b) {
        return service.multiply(a, b);
    }

}