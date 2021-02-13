package com.navestec.course.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navestec.course.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
