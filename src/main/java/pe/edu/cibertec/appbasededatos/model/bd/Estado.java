package pe.edu.cibertec.appbasededatos.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "estado")
public class Estado {
	@Id
	private Integer idestado;
	@Column(name="descestado")
	private String descestado;
	
}
