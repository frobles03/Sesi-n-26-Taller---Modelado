package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Interaccion {
    @Id
    private Integer id_interaccion;

    private String nombre_interaccion;
    private Integer limite_interaccion;

    // Getters y setters
}
