package com.example.employeeAddress.service;

import com.example.employeeAddress.model.Address;
import com.example.employeeAddress.model.Employee;
import com.example.employeeAddress.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmpRepo iEmpRepo;


    public String addEmployee(Employee emp) {
        iEmpRepo.save(emp);
        return "added";
    }

    //----------
    public Iterable<Employee> getAllEmployees() {
        return iEmpRepo.findAll();

    }

    public String deleteById(Long id) {
        iEmpRepo.deleteById(id);
        return " deleted...." ;
    }

    public String updateEmployeeById(Long id, Address address) {
        Optional<Employee> employeeOptional = iEmpRepo.findById(id);
        if(employeeOptional==null){
            return "id not found";
        }
        Employee employee = employeeOptional.get();
        employee.setAddress(address);
        iEmpRepo.save(employee);
        return "address updated successfully";


    }
}
