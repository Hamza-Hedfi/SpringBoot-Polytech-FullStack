package edu.polytech.ch5_tp1_v2;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);

    List<Person> findByLastNameAndFirstName(@Param("last") String last, @Param("first") String first);

    @Query(value = "SELECT * FROM person p WHERE p.last_name = 'Omrani'", nativeQuery = true)
    Person amine();

}