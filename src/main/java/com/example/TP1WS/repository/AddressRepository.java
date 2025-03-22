package com.example.TP1WS.repository;

import com.example.TP1WS.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
