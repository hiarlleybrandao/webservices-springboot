package com.brandaostartup.webservicesSB.services;

import com.brandaostartup.webservicesSB.entities.User;
import com.brandaostartup.webservicesSB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }


    public User findById(Long id){
       Optional<User> obj = repository.findById(id);
     return obj.get();
    }


}
