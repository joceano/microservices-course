package com.joceano.hrworker.repositories;

import com.joceano.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository  extends JpaRepository<Worker, Long> {
}
