package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.MallaCurricular;
public interface MallaCurricularService {
	
	void guardar(MallaCurricular mallaCurricular);
	void actualizar(MallaCurricular mallaCurricular);
	void eliminar (Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);

}