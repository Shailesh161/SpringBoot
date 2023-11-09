package com.example.person.person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person.person.entity.PersonV2;

public interface PersonV2Repository extends JpaRepository<PersonV2, Integer> {
    // Your custom query methods, if any
}
