package com.telusko.cloud.deployment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.cloud.deployment2.model.Employee;
import com.telusko.cloud.deployment2.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repo;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        return repo.findAll();
    }
}