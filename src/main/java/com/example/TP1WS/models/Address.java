package com.example.TP1WS.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name="id_address")
    private UUID id;

    private String streetName;

    private String city;

    private String postalCode;

    private String country;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Address(String streetName, String city, String postalCode, String country, User user) {
        this.id = UUID.randomUUID();
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.user = user;
    }
}
