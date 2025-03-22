package com.example.TP1WS.dto;


import java.util.List;

public class UserDto {

    private String firstName;

    private String lastName;

    private List<AddressDto> address;

    public UserDto(String firstName, String lastName, List<AddressDto> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<AddressDto> getAddress() {
        return address;
    }

    public void setAddress(List<AddressDto> address) {
        this.address = address;
    }
}
