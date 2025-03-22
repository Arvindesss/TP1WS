package com.example.TP1WS.controllers;

import com.example.TP1WS.dto.mapper.AddressToAddressResponseConverter;
import com.example.TP1WS.dto.response.AddressResponse;
import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("")
    public ResponseEntity<AddressResponse> createAddress(@RequestBody AddressDto addressDto) {
        Address address = addressService.createAddress(addressDto);
        AddressResponse addressResponse = AddressToAddressResponseConverter.convert(address);
        return ResponseEntity.ok(addressResponse);
    }
}
