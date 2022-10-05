package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.Profesor;

public interface ProfesorService {
	
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar (Integer id);
	List<Profesor> listar();
	Profesor obtener(Integer id);
}
