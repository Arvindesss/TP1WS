package com.example.TP1WS.controllers;

import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;
import com.example.TP1WS.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@AllArgsConstructor
@RequestMapping("v1/address")
public class AddressController {

    private AddressService addressService;

    @PostMapping("")
    public ResponseEntity<AddressDto> createAddress(@RequestBody AddressDto addressDto) {
        Address address = addressService.createAddress(addressDto);
        AddressDto addressDto1 = new AddressDto(address.getStreetName(), addressDto.getCity(), addressDto.getPostalCode(), addressDto.getCountry(), address.getUser().getId());
        return ResponseEntity
                .created(URI.create("v1/address" + address.getId()))
                .body(addressDto1);
    }
}
