package com.sb.SpringBootJune2026.withstrategypattern.factory;

import com.sb.SpringBootJune2026.withstrategypattern.service.RecommendationStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class RecommendationFactory {

    private final Map<String, RecommendationStrategy> strategies;

    public RecommendationFactory(Map<String, RecommendationStrategy> strategies) {
        this.strategies = strategies;
    }

    public RecommendationStrategy getStrategy(String userType) {
        RecommendationStrategy strategy = strategies.get(userType);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown user type: " + userType);
        }
        return strategy;
    }

}