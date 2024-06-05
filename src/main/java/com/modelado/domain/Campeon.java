package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Campeon {
    @Id
    private Integer id_campeon;

    private String tipo_ataque;
    private Integer vida_base;
    private boolean mana_bool;
    private boolean energia_bool;
    private float velocidad_ataque_base;
    private float velocidad_movimiento_base;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter")
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival")
    private Rival rival;

    // Getters y setters
}
