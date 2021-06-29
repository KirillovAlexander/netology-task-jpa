package ru.netology.daoandhibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.daoandhibernate.dao.PersonRepository;
import ru.netology.daoandhibernate.entity.Person;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThen(int age) {
        return personRepository.getPersonsByAgeLessThan(age);
    }

    public Person getPersonByNameAndSurname(String name, String surname) {
        return personRepository.getPersonByNameAndSurname(name, surname).orElseThrow(() -> new EntityNotFoundException("Person not found."));
    }

}
