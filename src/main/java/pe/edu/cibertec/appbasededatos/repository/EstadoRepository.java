package pe.edu.cibertec.appbasededatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appbasededatos.model.bd.Estado;

@Repository
public interface EstadoRepository 
	extends JpaRepository<Estado,Integer> {
	
}
