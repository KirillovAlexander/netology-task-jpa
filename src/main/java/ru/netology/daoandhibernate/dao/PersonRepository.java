package ru.netology.daoandhibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.netology.daoandhibernate.entity.Person;
import ru.netology.daoandhibernate.entity.PersonId;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
//    List<Person> getByCityOfLiving(String city);
//
//    List<Person> getByPersonIdAgeLessThan(int age);
//
//    Optional<Person> getByPersonIdNameAndPersonIdSurname(String name, String surname);

    @Query("select p from Person p where p.cityOfLiving = :city")
    List<Person> getPersonsByCityOfLiving(@Param("city") String city);

    @Query("select p from Person p where p.personId.age < :age")
    List<Person> getPersonsByAgeLessThan(@Param("age") int age);

    @Query("select p from Person p where p.personId.name = :name and p.personId.surname = :surname")
    Optional<Person> getPersonByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
