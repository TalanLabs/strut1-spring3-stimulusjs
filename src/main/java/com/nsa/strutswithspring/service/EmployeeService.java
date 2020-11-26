package com.nsa.strutswithspring.service;

import java.util.List;

import com.nsa.strutswithspring.domain.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void updateEmployees(List<Employee> employees);
}
