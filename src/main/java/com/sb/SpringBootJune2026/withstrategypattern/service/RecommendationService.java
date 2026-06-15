package com.sb.SpringBootJune2026.withstrategypattern.service;

import com.sb.SpringBootJune2026.withstrategypattern.factory.RecommendationFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RecommendationService {

    private final RecommendationFactory recommendationFactory;

    public RecommendationService(RecommendationFactory recommendationFactory) {
        this.recommendationFactory = recommendationFactory;
    }

    public List<String> recommend(String user, String userType) {
        RecommendationStrategy strategy = recommendationFactory.getStrategy(userType);
        return strategy.recommend(user);
    }

}