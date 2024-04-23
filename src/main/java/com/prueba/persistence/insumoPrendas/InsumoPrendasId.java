package com.prueba.persistence.insumoPrendas;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InsumoPrendasId implements Serializable {

    @Column(name = "id_insumo_fk")
    private Integer idInsumoFk;

    @Column(name = "id_prenda_fk")
    private Integer idPrendaFk;

    public Integer getIdInsumoFk() {
        return idInsumoFk;
    }

    public void setIdInsumoFk(Integer idInsumoFk) {
        this.idInsumoFk = idInsumoFk;
    }

    public Integer getIdPrendaFk() {
        return idPrendaFk;
    }

    public void setIdPrendaFk(Integer idPrendaFk) {
        this.idPrendaFk = idPrendaFk;
    }
}
