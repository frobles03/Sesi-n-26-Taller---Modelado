package com.modelado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelado.domain.CampeonHasInteraccion;
import com.modelado.domain.CampeonHasInteraccionPK;

public interface CampeonHasInteraccionRepository extends JpaRepository<CampeonHasInteraccion, CampeonHasInteraccionPK> { }
