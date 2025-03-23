package com.example.TP1WS.services;

import com.example.TP1WS.dto.AddressDto;
import com.example.TP1WS.dto.UserDto;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;

public interface AddressService {

    Address createAddress(AddressDto addressDto);
}
