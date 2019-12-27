package com.crud.crud.Service.impl;

import com.crud.crud.Entities.Person;
import com.crud.crud.Model.PersonDTO;
import com.crud.crud.Service.PersonService;
import com.crud.crud.dal.PersonDal;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDal personDal;


    @Override
    public void save(List<PersonDTO>personDTOS) throws Exception {
        for (PersonDTO person :personDTOS) {
            Person person1 = new Person();
            BeanUtils.copyProperties(person,person1);
            personDal.save(person1);
        }
    }

    @Override
    public List<Person> findAll() throws Exception {
        return personDal.findAll();
    }


    /*@Override
    public void save(List<PersonDTO>personDTOS) throws Exception {
        for (PersonDTO person :personDTOS) {
            Person person1 = new Person();
            person1.setId(person.getId());
            person1.setName(person.getName());
            person1.setNumber(person.getNumber());
            personDal.save(person1);
        }
    }*/
}
