package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.Curso;
public interface CursoService {
	
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar (Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);

}