package com.crud.crud.Service.impl;

import com.crud.crud.Entities.User;
import com.crud.crud.Model.UserDTO;
import com.crud.crud.Service.UserService;
import com.crud.crud.dal.UserDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDal userDal;

    @Override
    public void save(List<UserDTO> user) throws Exception {
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserDTO userDTO : userDTOS){
            User user1 = new User();
            user1.setName(userDTO.getName());
            user1.setAddress(userDTO.getAddress());
            user1.setNumber(userDTO.getNumber());
            userDal.save(userDTOS);
        }

    }

    @Override
    public void saveAll(List<User> userList) throws Exception {
        userDal.saveAll(userList);
    }
}
