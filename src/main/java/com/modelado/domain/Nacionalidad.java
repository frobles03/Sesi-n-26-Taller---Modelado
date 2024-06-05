package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Nacionalidad {
    @Id
    private Integer id_nacionalidad;

    @Enumerated(EnumType.STRING)
    private NacionalidadNombre nombre;

    // Getters y setters

    public Integer getId_nacionalidad() {
        return id_nacionalidad;
    }

    public void setId_nacionalidad(Integer id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public NacionalidadNombre getNombre() {
        return nombre;
    }

    public void setNombre(NacionalidadNombre nombre) {
        this.nombre = nombre;
    }
}

enum NacionalidadNombre {
    OPC1, OPC2, OPC3 
}
