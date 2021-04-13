package com.anassifi.spring.contollers;

import java.util.List;
import java.util.Optional;

import com.anassifi.spring.entities.Employee;
import com.anassifi.spring.repositories.EmployeeRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    };

    @GetMapping("/employees")
    List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @PostMapping("/employees")
    Employee saveEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    public EmployeeRepository getEmployeeRepository() {
        return this.employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

}
