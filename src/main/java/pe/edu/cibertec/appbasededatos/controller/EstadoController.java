package pe.edu.cibertec.appbasededatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appbasededatos.service.EstadoService;

@Controller
@RequestMapping("/Estado")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/frmMantEstado")
	public String frmMantEstado(Model model) {
		model.addAttribute("listaEstado",estadoService.listarEstados());
		return "frmMantEstado";
	}	
	
}
