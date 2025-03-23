package com.example.TP1WS.services;


import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;
import com.example.TP1WS.repository.AddressRepository;
import com.example.TP1WS.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    private UserRepository userRepository;

    @Override
    public Address createAddress(AddressDto addressDto) {
        User user = userRepository.getUserById(addressDto.getUserId());
        Address address = new Address(addressDto.getStreetName(),
                addressDto.getCity(),
                addressDto.getPostalCode(),
                addressDto.getCountry(),
                user);
        return addressRepository.save(address);
    }
}
