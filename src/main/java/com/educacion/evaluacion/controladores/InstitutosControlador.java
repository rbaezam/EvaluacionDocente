package com.educacion.evaluacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 23/01/12
 * Hora: 12:18 AM
 */
@Controller
public class InstitutosControlador {

	@RequestMapping("/institutos/")
	public String index(ModelMap modelo) {
		return "institutos/index";
	}
}
