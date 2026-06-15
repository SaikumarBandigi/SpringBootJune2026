package com.sb.SpringBootJune2026.afterspring.controller;


import com.sb.SpringBootJune2026.afterspring.model.Worker;
import com.sb.SpringBootJune2026.afterspring.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @PostMapping("/saveWorker")
    public Worker saveWorker(@RequestBody Worker worker) {
        return workerRepository.save(worker);
    }

}
