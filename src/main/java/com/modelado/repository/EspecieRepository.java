package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Integer> { }

