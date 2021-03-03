package com.paola.tddjunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paola.tddjunit.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}