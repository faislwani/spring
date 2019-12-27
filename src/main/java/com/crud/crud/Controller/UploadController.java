package com.crud.crud.Controller;

import com.crud.crud.Entities.Person;
import com.crud.crud.Entities.User;
import com.crud.crud.Model.ApiResponse;
import com.crud.crud.Model.PersonDTO;
import com.crud.crud.Service.PersonService;
import com.crud.crud.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/insertUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse insertUser(@RequestBody List<User> userList, HttpServletResponse response){
        ApiResponse apiResponse = new ApiResponse();

        try {
            userService.saveAll(userList);
            apiResponse.setSuccessful(true);
        }
        catch (Exception e){
            e.printStackTrace();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            apiResponse.setSuccessful(false);
        }
        return apiResponse;
    }

    @PostMapping(value = "/insertPerson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse insertPerson(@RequestBody List<PersonDTO> personDTO, HttpServletResponse response){
        ApiResponse apiResponse = new ApiResponse();
        try {
            personService.save(personDTO);
            apiResponse.setSuccessful(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return apiResponse;
    }
    @GetMapping(value = "/getPerson", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse getAllPersons(HttpServletResponse response, ApiResponse apiResponse){
        try{
            personService.findAll();
            apiResponse.setSuccessful(true);
            response.setStatus(200);
        }
        catch (Exception e)
        {

        }
        return apiResponse;
    }

}
