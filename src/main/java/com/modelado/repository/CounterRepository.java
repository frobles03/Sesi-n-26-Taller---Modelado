package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.Counter;

public interface CounterRepository extends JpaRepository<Counter, Integer> { }