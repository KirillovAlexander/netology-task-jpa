package ru.netology.daoandhibernate.dao;

import org.springframework.stereotype.Repository;
import ru.netology.daoandhibernate.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonDAO {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.cityOfLiving =: city", Person.class);
        query.setParameter("city", city);
        List<Person> persons = query.getResultList();
        return persons;
    }
}
