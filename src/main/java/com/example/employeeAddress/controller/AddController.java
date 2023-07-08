package com.example.employeeAddress.controller;


import com.example.employeeAddress.model.Address;
import com.example.employeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddController {

    @Autowired
    AddressService addressService;

    // post  a address
    @PostMapping(" address")
    public void addAddress(Address address) {
        addressService.addAddress(address);
    }

    // get all address
    @GetMapping("addressess")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    // get address by id
    @GetMapping("address")
    public Optional<Address> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    // delete a address by id
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id) {
        return addressService.deleteAddressById(id);
    }

    // update a address
    @PutMapping("address/{id}/{city}")
    public String updateAddressById(@PathVariable Long id, @PathVariable String addCity) {
        return addressService.updateAddressById(id, addCity);
    }
}


