package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.Campeon;

public interface CampeonRepository extends JpaRepository<Campeon, Integer> { }