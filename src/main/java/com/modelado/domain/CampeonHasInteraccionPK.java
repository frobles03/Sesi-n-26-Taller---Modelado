package com.modelado.domain;

import java.io.Serializable;
import java.util.Objects;

public class CampeonHasInteraccionPK implements Serializable {
    private Integer campeon_id_campeon;
    private Integer campeon_counter_id_counter;
    private Integer interaccion_id_interaccion;

    // Getters, setters, equals, and hashCode
    public Integer getCampeon_id_campeon() {
        return campeon_id_campeon;
    }

    public void setCampeon_id_campeon(Integer campeon_id_campeon) {
        this.campeon_id_campeon = campeon_id_campeon;
    }

    public Integer getCampeon_counter_id_counter() {
        return campeon_counter_id_counter;
    }

    public void setCampeon_counter_id_counter(Integer campeon_counter_id_counter) {
        this.campeon_counter_id_counter = campeon_counter_id_counter;
    }

    public Integer getInteraccion_id_interaccion() {
        return interaccion_id_interaccion;
    }

    public void setInteraccion_id_interaccion(Integer interaccion_id_interaccion) {
        this.interaccion_id_interaccion = interaccion_id_interaccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampeonHasInteraccionPK that = (CampeonHasInteraccionPK) o;
        return Objects.equals(campeon_id_campeon, that.campeon_id_campeon) &&
               Objects.equals(campeon_counter_id_counter, that.campeon_counter_id_counter) &&
               Objects.equals(interaccion_id_interaccion, that.interaccion_id_interaccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campeon_id_campeon, campeon_counter_id_counter, interaccion_id_interaccion);
    }
}
