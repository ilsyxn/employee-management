package com.employees.employee_management.controller;

import com.employees.employee_management.model.Person;
import com.employees.employee_management.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Erlaubt Next.js lokal auf den Endpoint zuzugreifen
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll(); // Liefert alle Personen aus der DB
    }

    @PostMapping
    public Person createPerson(@RequestBody Person newPerson) {
        return personRepository.save(newPerson); // Fügt neue Person in DB ein
    }
}
