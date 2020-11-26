package com.nsa.strutswithspring.dao;

import java.util.List;

import com.nsa.strutswithspring.domain.Employee;

public interface EmployeeDao {
    List<Employee> getAllEmployees();

    void updateEmployees(List<Employee> employees);
}
