package com.example.democrud.service;

import com.example.democrud.dto.Userrequest;
import com.example.democrud.entity.Userentity;
import com.example.democrud.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {
    @Autowired
    Userrepository repository;
    public List<Userentity> homepage(){
        List<Userentity> users=repository.findAll();
        return users;
    }
    public void postuser(Userentity user){

        this.repository.save(user);
    }

//    public Userentity updateuser(int id, Userrequest request){
//      Userentity user=repository.findById(id).orElse(null);
//     user.setName(request.getName());
//     user.setEmail(request.getEmail());
//     repository.save(user);
//     return user;
//    }
}
