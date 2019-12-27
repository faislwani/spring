package com.crud.crud.dal;

import com.crud.crud.Entities.User;
import com.crud.crud.Model.UserDTO;

import java.util.List;

public interface UserDal {

    void save(User user) throws Exception;

    List<UserDTO> save(List<UserDTO> user) throws Exception;

    void saveAll(List<User> userList) throws Exception;
}
