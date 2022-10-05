package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer > {

}
