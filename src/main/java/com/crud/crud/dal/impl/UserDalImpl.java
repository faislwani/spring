package com.crud.crud.dal.impl;

import com.crud.crud.Entities.User;
import com.crud.crud.Model.UserDTO;
import com.crud.crud.dal.UserDal;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDalImpl implements UserDal {

    private final MongoTemplate mongoTemplate;

    public UserDalImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(User user) throws Exception {
        mongoTemplate.save(user);
    }

    @Override
    public List<UserDTO> save(List<UserDTO> user) throws Exception {
        mongoTemplate.save(user);
        return user;
    }

    @Override
    public void saveAll(List<User> userList) throws Exception {
        for (User users : userList) {
            save(users);
        }
    }
}
