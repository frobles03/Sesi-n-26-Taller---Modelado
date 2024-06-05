package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@IdClass(CampeonHasInteraccionPK.class)
public class CampeonHasInteraccion {
    @Id
    private Integer campeon_id_campeon;
    
    @Id
    private Integer campeon_counter_id_counter;

    @Id
    private Integer interaccion_id_interaccion;

    @ManyToOne
    @JoinColumn(name = "campeon_id_campeon", insertable = false, updatable = false)
    private Campeon campeon;

    @ManyToOne
    @JoinColumn(name = "campeon_counter_id_counter", insertable = false, updatable = false)
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "interaccion_id_interaccion", insertable = false, updatable = false)
    private Interaccion interaccion;

    // Getters y setters
}
