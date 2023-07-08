package com.example.employeeAddress.repo;

import com.example.employeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmpRepo extends CrudRepository<Employee, Long> {


}
