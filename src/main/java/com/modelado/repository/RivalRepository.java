package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.Rival;

public interface RivalRepository extends JpaRepository<Rival, Integer> { }