package com.anassifi.spring.repositories;

import com.anassifi.spring.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}