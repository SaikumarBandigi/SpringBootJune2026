package com.sb.SpringBootJune2026.withstrategypattern.serviceimpl;


import com.sb.SpringBootJune2026.withstrategypattern.service.RecommendationStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NewUserStrategy implements RecommendationStrategy {

    @Override
    public List<String> recommend(String user) {
        return List.of("Popular Movie 1", "Popular Movie 2");
    }

}