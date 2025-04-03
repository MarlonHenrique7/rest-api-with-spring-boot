package br.com.marlonhenrique7.repository;

import br.com.marlonhenrique7.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
