package com.educacion.evaluacion.servicios;

import com.educacion.evaluacion.entidades.Instituto;
import com.educacion.evaluacion.repositorios.InstitutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class InstitutoServicios {

	@Autowired
	private InstitutoRepositorio repositorio;

	@Transactional
	public Instituto guardar(Instituto instituto) {
		return repositorio.save(instituto);
	}

	public List<Instituto> obtenerTodos() {
		return repositorio.findAll();
	}
}
