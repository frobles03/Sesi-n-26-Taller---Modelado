package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.Interaccion;

public interface InteraccionRepository extends JpaRepository<Interaccion, Integer> { }