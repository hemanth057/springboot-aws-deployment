package com.telusko.cloud.deployment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud")
public class Employee {

    @Id
    private int id;
    private String name;
    private String role;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }
}