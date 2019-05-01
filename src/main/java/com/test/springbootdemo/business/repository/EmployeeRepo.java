package com.test.springbootdemo.business.repository;

import com.test.springbootdemo.business.dao.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
