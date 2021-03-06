package ru.netology.daoandhibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daoandhibernate.entity.Person;
import ru.netology.daoandhibernate.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personService.getPersonsByCity(city);
    }
}
