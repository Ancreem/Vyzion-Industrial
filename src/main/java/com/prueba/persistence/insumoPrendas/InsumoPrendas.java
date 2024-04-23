package com.prueba.persistence.insumoPrendas;


import com.prueba.persistence.Insumo;
import com.prueba.persistence.Prenda;
import jakarta.persistence.*;

@Entity
@Table(name = "detalle_pedido")
public class InsumoPrendas {

    @EmbeddedId
    private InsumoPrendasId id;

    @ManyToOne
    @MapsId("idInsumoFk")
    @JoinColumn(name = "id_insumo_fk")
    private Insumo insumo;

    @ManyToOne
    @MapsId("idPrendaFk")
    @JoinColumn(name = "id_prenda_fk")
    private Prenda prenda;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public InsumoPrendasId getId() {
        return id;
    }

    public void setId(InsumoPrendasId id) {
        this.id = id;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
