package com.example.person.person.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.person.person.Repository.PersonV1Repository;
import com.example.person.person.entity.PersonV1;
import com.example.person.person.service.PersonV1Service;

@Service
public class PersonV1_Impl implements PersonV1Service {
    @Autowired
    private PersonV1Repository personV1Repository;

    @Override
    public PersonV1 createPersonV1(String id, String name, String address) {
        // Create a new PersonV1 object
        PersonV1 person = new PersonV1();
        person.setID(id);
        person.setName(name);
        person.setAddress(address);

        // Save the new PersonV1 in the database
        return personV1Repository.save(person);
    }
}
