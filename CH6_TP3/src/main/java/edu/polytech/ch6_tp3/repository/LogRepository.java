package edu.polytech.ch6_tp3.repository;

import edu.polytech.ch6_tp3.entity.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Integer> {
}
