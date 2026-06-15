package com.sb.SpringBootJune2026.afterspring.repository;

import com.sb.SpringBootJune2026.afterspring.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
