package ru.netology.daoandhibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private PersonId personId;

    private String phoneNumber;

    private String cityOfLiving;
}

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class PersonId implements Serializable {
    private String name;

    private String surname;

    private int age;
}


