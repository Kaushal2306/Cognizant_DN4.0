package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee() {

        Employee emp = new Employee();

        emp.setName("Kaushal");
        emp.setDepartment("AIML");

        repository.save(emp);

        System.out.println("Employee Saved Successfully");
    }
}