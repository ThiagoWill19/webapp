package com.will.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.will.entities.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}
