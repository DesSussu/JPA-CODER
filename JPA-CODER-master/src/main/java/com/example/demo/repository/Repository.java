package com.example.demo.repository;

import com.example.demo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {

}
