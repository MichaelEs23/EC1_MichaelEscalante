package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer >{

}
