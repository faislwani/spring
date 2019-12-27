package com.crud.crud.dal.impl;

import com.crud.crud.Entities.Person;
import com.crud.crud.Model.PersonDTO;
import com.crud.crud.dal.PersonDal;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDalImpl implements PersonDal {

    private final MongoTemplate mongoTemplate;

    public PersonDalImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(Person person) throws Exception {
    mongoTemplate.save(person);
    }

    @Override
    public void saveAll(List<Person> personList) throws Exception {
            mongoTemplate.save(personList);
    }

    @Override
    public List<Person> findAll() throws Exception {
        return mongoTemplate.findAll(Person.class);
    }


}
