package com.example.MicroserviceTwo.service.impl;

import com.example.MicroserviceTwo.address.Address;
import com.example.MicroserviceTwo.repository.AddressRepo;
import com.example.MicroserviceTwo.response.AddressResponse;
import com.example.MicroserviceTwo.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.example.MicroserviceTwo.address.Address;
import com.example.MicroserviceTwo.repository.AddressRepo;
import com.example.MicroserviceTwo.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findById(employeeId);
//        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);

        return mapper.map(addressByEmployeeId, AddressResponse.class);
    }
}
