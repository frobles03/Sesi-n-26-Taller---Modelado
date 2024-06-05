package com.modelado.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Especie {
    @Id
    private Integer id_especie;

    @Enumerated(EnumType.STRING)
    private EspecieNombre nombre;

    // Getters y setters

    public Integer getId_especie() {
        return id_especie;
    }

    public void setId_especie(Integer id_especie) {
        this.id_especie = id_especie;
    }

    public EspecieNombre getNombre() {
        return nombre;
    }

    public void setNombre(EspecieNombre nombre) {
        this.nombre = nombre;
    }
}

enum EspecieNombre {
    ESPECIE1, ESPECIE2, ESPECIE3
}
