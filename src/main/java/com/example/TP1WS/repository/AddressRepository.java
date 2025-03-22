package com.example.TP1WS.repository;

import com.example.TP1WS.models.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
