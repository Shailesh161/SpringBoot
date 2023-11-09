package com.example.person.person.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.person.Repository.PersonV2Repository;
import com.example.person.person.entity.PersonV2;
import com.example.person.person.entity.Person_Name;
import com.example.person.person.service.PersonV2Service;

@Service
public class PersonV2_Impl implements PersonV2Service {
    @Autowired
    private PersonV2Repository personV2Repository;

    @Override
    public PersonV2 createPersonV2(Integer id, Person_Name name, String address) {
        // Create a new PersonV2 object
        PersonV2 person = new PersonV2();
        person.setId(id);
        person.setName(name);
        person.setAddress(address);

        // Save the new PersonV2 in the database
        return personV2Repository.save(person);
    }

	
}
