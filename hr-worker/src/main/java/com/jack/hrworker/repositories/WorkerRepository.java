package com.jack.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
