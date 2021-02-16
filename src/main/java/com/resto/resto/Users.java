package com.resto.resto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/resto/users")
public class Users {
    @GetMapping(value = "/get")
    public List getUsers(){
        List al = new ArrayList();
        al.add("Akshay");
        al.add("Kinjal");
        al.add("Acchu");

        return  al;
    }
}
