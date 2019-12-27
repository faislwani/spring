package com.crud.crud.Service;

import com.crud.crud.Entities.Person;
import com.crud.crud.Model.PersonDTO;

import java.util.List;

public interface PersonService {
    void save(List<PersonDTO> person) throws Exception;
    List<Person>findAll() throws Exception;
}
