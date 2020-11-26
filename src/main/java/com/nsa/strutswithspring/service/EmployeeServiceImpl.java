package com.nsa.strutswithspring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsa.strutswithspring.dao.EmployeeDao;
import com.nsa.strutswithspring.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public void updateEmployees(List<Employee> employees) {
        employeeDao.updateEmployees(employees);
    }

}
