package com.example.person.person.service;

import com.example.person.person.entity.PersonV2;
import com.example.person.person.entity.Person_Name;

public interface PersonV2Service 
{
    PersonV2 createPersonV2(Integer id, Person_Name name, String address);
}

