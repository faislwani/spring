package com.crud.crud.Service;

import com.crud.crud.Entities.User;
import com.crud.crud.Model.UserDTO;

import java.util.List;

public interface UserService {
    void save(List<UserDTO> user) throws Exception;

    void saveAll(List<User> userList) throws Exception;
}
