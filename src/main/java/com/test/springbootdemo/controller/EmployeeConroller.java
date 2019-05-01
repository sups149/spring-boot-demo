package com.test.springbootdemo.controller;

import com.test.springbootdemo.business.dao.entity.Employee;
import com.test.springbootdemo.business.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class EmployeeConroller {
    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        List<Employee> empList = new LinkedList<>();
        employeeRepo.findAll().forEach(empList::add);
        return empList;
    }

}
