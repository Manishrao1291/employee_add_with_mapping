package com.example.employeeAddress.service;


import com.example.employeeAddress.model.Address;
import com.example.employeeAddress.repo.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddRepo iAddRepo;

    public void addAddress(Address address) {
        iAddRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return (List<Address>) iAddRepo.findAll();
    }


    public Optional<Address> getAddressById(Long id) {

        return  iAddRepo.findById(id);
    }

    public String updateAddressById(Long id, String addCity) {
        Optional<Address> addressOptional = iAddRepo.findById(id);
        Address address = addressOptional.get();
        if(address==null){
            return "id not found";
        }
        address.setAddCity(addCity);
        iAddRepo.save(address);
        return "address updated successfully";
    }

    public String deleteAddressById(Long id) {
        iAddRepo.deleteById(id);
        return " deleted";
    }
}
