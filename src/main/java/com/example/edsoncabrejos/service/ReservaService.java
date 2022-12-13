package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.dto.ReservaDTO;

public interface ReservaService {

	List<ReservaDTO> lista();
	void guardar(ReservaDTO reserva);
}
