package com.example.employeeAddress.controller;


import com.example.employeeAddress.model.Address;
import com.example.employeeAddress.model.Employee;
import com.example.employeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    // post a employee
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }
   //------------
    //  get all employees
    @GetMapping("employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // delete a employee
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable Long empId){
        return employeeService.deleteById(empId);
    }

    //update a employee by id
    @PutMapping("employee/{id}")
    public String updateEmployeeById(@PathVariable Long id, @RequestBody Address address){
        return employeeService.updateEmployeeById(id,address);
    }

}
