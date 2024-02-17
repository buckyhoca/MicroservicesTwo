package com.example.MicroserviceTwo.service;
import com.example.MicroserviceTwo.response.AddressResponse;


public interface AddressService {
    AddressResponse findAddressByEmployeeId(int employeeId);
}
