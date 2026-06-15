package com.sb.SpringBootJune2026.withstrategypattern.service;

import java.util.List;

public interface RecommendationStrategy {
    List<String> recommend(String user);
}
