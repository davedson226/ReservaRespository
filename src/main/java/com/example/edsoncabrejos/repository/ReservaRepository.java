package com.example.edsoncabrejos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edsoncabrejos.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
	
}
