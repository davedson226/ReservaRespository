package com.example.edsoncabrejos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.dto.ReservaDTO;

import com.example.edsoncabrejos.model.Reserva;
import com.example.edsoncabrejos.repository.ReservaRepository;

@Service
public class ReservaServiceImp implements ReservaService {

	
	@Autowired
	private ReservaRepository repository;
	@Override
	public List<ReservaDTO> lista() {
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;
				
		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setNom(reserva.getNombre());
			dto.setCod(reserva.getIdReserva());
			listadto.add(dto);
		}
		
	
		return listadto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		Reserva hos = new Reserva();
		hos.setNombre(reserva.getNom());
		hos.setIdReserva(reserva.getCod());
		
		repository.save(hos);

	}

}
