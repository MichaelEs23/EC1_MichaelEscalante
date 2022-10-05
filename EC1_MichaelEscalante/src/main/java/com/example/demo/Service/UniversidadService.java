package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Universidad;


public interface UniversidadService {
	
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar (Integer id);
	List<Universidad> listar();
	Universidad obtener(Integer id);

}
