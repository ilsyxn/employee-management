package com.employees.employee_management.repository;
import com.employees.employee_management.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // Hier brauchst du oft keine eigenen Methoden,
    // weil JpaRepository schon CRUD-Methoden liefert.
}
