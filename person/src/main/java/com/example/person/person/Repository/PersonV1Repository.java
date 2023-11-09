package com.example.person.person.Repository;

import com.example.person.person.entity.PersonV1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonV1Repository extends JpaRepository<PersonV1, String> {
    // Your custom query methods, if any
}
