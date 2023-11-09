package com.example.person.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.person.person.entity.PersonV1;
import com.example.person.person.entity.PersonV2;
import com.example.person.person.entity.Person_Name;
import com.example.person.person.service.PersonV1Service;
import com.example.person.person.service.PersonV2Service;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonV1Service personV1Service;

    @Autowired
    private PersonV2Service personV2Service;

    // Create a new PersonV1
    @PostMapping("/v1/create")
    public PersonV1 createPersonV1(@RequestParam String id, @RequestParam String name, @RequestParam String address) {
        return personV1Service.createPersonV1(id, name, address);
    }

    // Create a new PersonV2
    @PostMapping("/v2/create")
    public PersonV2 createPersonV2(@RequestParam Integer id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String address) {
        Person_Name name = new Person_Name(firstName, lastName);
        return personV2Service.createPersonV2(id, name, address);
    }
}

