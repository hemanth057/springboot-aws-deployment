package com.telusko.cloud.deployment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.cloud.deployment2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}