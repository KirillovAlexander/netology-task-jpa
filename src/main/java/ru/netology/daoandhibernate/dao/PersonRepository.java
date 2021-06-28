package ru.netology.daoandhibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.daoandhibernate.entity.Person;
import ru.netology.daoandhibernate.entity.PersonId;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> getByCityOfLiving(String city);

    List<Person> getByPersonIdAgeLessThan(int age);

    Optional<Person> getByPersonIdNameAndPersonIdSurname(String name, String surname);
}
