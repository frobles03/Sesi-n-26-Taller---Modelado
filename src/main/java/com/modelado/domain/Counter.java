package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Counter {
    @Id
    private Integer id_counter;

    private String nombre;
    private float porcentaje_victoria;
    private float porcentaje_derrota;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie")
    private Especie especie;

    // Getters y setters
}
