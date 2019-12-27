package com.crud.crud.dal;

import com.crud.crud.Entities.Person;
import com.crud.crud.Model.PersonDTO;

import java.util.List;

public interface PersonDal {

    void save(Person person) throws Exception;
    void saveAll(List<Person> personList) throws Exception;
    List <Person> findAll() throws Exception;
}
