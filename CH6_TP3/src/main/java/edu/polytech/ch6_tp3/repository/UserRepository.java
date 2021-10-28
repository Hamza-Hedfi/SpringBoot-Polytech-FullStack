package edu.polytech.ch6_tp3.repository;

import edu.polytech.ch6_tp3.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
