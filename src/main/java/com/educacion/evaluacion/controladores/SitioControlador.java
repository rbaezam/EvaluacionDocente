package com.educacion.evaluacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SitioControlador {

	@RequestMapping("/")
	public String index(ModelMap modelo) {
		return "index";
	}
	
}
