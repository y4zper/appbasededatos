package pe.edu.cibertec.appbasededatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appbasededatos.model.bd.Estado;
import pe.edu.cibertec.appbasededatos.repository.EstadoRepository;


@Serviceo
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarEstados(){
		
		return estadoRepository.findAll();
	}
	
	public  void registrarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
}
