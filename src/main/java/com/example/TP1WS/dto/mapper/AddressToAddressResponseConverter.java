package com.example.TP1WS.dto.mapper;

import com.example.TP1WS.dto.response.AddressResponse;
import com.example.TP1WS.dto.response.UserResponse;
import com.example.TP1WS.models.Address;
import com.example.TP1WS.models.User;

public class AddressToAddressResponseConverter {

    public static AddressResponse convert(Address address) {
        return new AddressResponse(
                address.getStreetName(),
                address.getCity(),
                address.getPostalCode(),
                address.getCountry(),
                address.getUser().getId()
        );
    }
}
