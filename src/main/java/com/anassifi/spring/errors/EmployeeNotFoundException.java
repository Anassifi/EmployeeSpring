package com.anassifi.spring.errors;

public class EmployeeNotFoundException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = -8859153019951978277L;

    EmployeeNotFoundException(Long id) {
        super("could not find Employee " + id);
    }
}
