package com.example.democrud.Controller;

import com.example.democrud.dto.Userrequest;
import com.example.democrud.entity.Userentity;
import com.example.democrud.repository.Userrepository;
import com.example.democrud.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class User {
    @Autowired
    Userservice service;
    @Autowired
    Userrepository repository;

    @GetMapping("/showuserpage")
    public String showuserpage(Model model){
        Userentity userentity=new Userentity();
        model.addAttribute("userentity",userentity);
        return "adduser";
    }

@PostMapping("/saveuser")
    public String saveuser(Userentity user,Model model){
   service.postuser(user);
   return "redirect:/getuser";
}
    @GetMapping("/getuser")
    public String getusers(Model model){
        List<Userentity> users=service.homepage();
        model.addAttribute("users",users);
        return "index";
    }
    @GetMapping("/updateuserform/{id}")
    public String updateuserform(@PathVariable int id,Model model){
        Userentity userentity= repository.findById(id).orElse(null);
        model.addAttribute("userentity",userentity);
        return "updateuser";
    }
    @GetMapping("/deleteuser/{id}")
   public String deleteuser(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/getuser";
    }


}
