package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Universidad;
import com.example.demo.Repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService{
	
	@Autowired
	private UniversidadRepository repository;

	@Override
	public void guardar(Universidad universidad) {
		repository.save(universidad);		
		
	}

	@Override
	public void actualizar(Universidad universidad) {
		repository.saveAndFlush(universidad);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
		
	}

	@Override
	public List<Universidad> listar() {
		return repository.findAll();		

	}

	@Override
	public Universidad obtener(Integer id) {
		return repository.findById(id).orElse(null);		

	}

}
