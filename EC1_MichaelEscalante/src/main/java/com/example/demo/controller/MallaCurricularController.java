package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MallaCurricular;
import com.example.demo.Service.MallaCurricularService;

@RestController
@RequestMapping("/malla/v1")
public class MallaCurricularController {
	
	@Autowired
	private MallaCurricularService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaCurricular>> listar() {
		return new ResponseEntity<List<MallaCurricular>>(service.listar(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCurricular mallaCurricular) {
		service.guardar(mallaCurricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCurricular> obtenerPodId(@PathVariable Integer id) {

		MallaCurricular mallaCurricular = service.obtener(id);

		if (mallaCurricular != null) {
			return new ResponseEntity<MallaCurricular>(mallaCurricular, HttpStatus.OK);
		} else {
			return new ResponseEntity<MallaCurricular>(mallaCurricular, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody MallaCurricular mallaCurricular) {
		MallaCurricular m = service.obtener(mallaCurricular.getIdMalla());

		if (m != null) {
			service.actualizar(mallaCurricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		}

	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		MallaCurricular mallaCurricular = service.obtener(id);
		
		if (mallaCurricular != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		}
		
	}
	
}
