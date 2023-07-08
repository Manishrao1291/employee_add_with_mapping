package com.example.employeeAddress.repo;

import com.example.employeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddRepo extends CrudRepository<Address, Long>
{

}

