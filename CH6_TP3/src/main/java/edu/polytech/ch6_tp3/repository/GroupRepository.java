package edu.polytech.ch6_tp3.repository;

import edu.polytech.ch6_tp3.entity.Groupe;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Groupe, Integer> {
}
