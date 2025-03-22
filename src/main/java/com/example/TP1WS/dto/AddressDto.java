package com.example.TP1WS.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class AddressDto {

    private String streetName;

    private String city;

    private String postalCode;

    private String country;

    private UUID userId;
}
