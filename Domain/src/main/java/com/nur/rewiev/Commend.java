package com.nur.rewiev;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.Entity;

import java.util.UUID;

public class Commend extends Entity {
    public UUID userId;
    public String valoracion;
    public String comentario;
    public String propiedad;

    public ValorationValueObject points;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public int getPoints() {
        return points.getPoints();
    }

    public void setPoints(ValorationValueObject points) {
        this.points = points;
    }

    public Commend(UUID userId, String valoracion, String comentario, String propiedad, int points) throws BusinessRuleValidationException {
        id = UUID.randomUUID();
        this.userId = userId;
        this.valoracion = valoracion;
        this.comentario = comentario;
        this.propiedad = propiedad;
        this.points = ValorationValueObject.implicitOperator(points);
    }

    public Commend() {
    }
}
