package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.modelado.domain.Nacionalidad;

public interface NacionalidadRepository extends JpaRepository<Nacionalidad, Integer> { }
