package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Curso;
import com.example.demo.Repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardar(Curso curso) {
		repository.save(curso);		
		
	}

	@Override
	public void actualizar(Curso curso) {
		repository.saveAndFlush(curso);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
		
	}

	@Override
	public List<Curso> listar() {
		return repository.findAll();		

	}

	@Override
	public Curso obtener(Integer id) {
		return repository.findById(id).orElse(null);		
	}
}
