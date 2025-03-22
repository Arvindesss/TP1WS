package com.example.TP1WS.services.impl;


import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;
import com.example.TP1WS.repository.AddressRepository;
import com.example.TP1WS.repository.UserRepository;
import com.example.TP1WS.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    private final UserRepository userRepository;

    public Address createAddress(AddressDto addressDto) {
        User user = userRepository.getUserById(addressDto.getUserId());
        Address address = new Address(addressDto.getStreetName(),
                addressDto.getCity(), addressDto.getPostalCode(),
                addressDto.getCountry(), user);
        return addressRepository.save(address);
    }
}
