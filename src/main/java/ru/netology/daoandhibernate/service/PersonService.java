package ru.netology.daoandhibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.daoandhibernate.dao.PersonDAO;
import ru.netology.daoandhibernate.entity.Person;

import java.util.List;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Person> getPersonsByCity(String city) {
        return personDAO.getPersonsByCity(city);
    }

}
