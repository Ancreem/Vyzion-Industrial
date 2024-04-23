package com.prueba.persistence;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad_producir", nullable = false)
    private int cantidadProducir;

    @Column(name = "prenda_id", nullable = false)
    private int prendaId;

    @Column(name = "cantidad_producida", nullable = false)
    private int cantidadProducida;


    @JoinColumn(name="id_orden_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Orden orden;

    @JoinColumn(name="id_prenda_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Prenda prenda;

    @JoinColumn(name="id_color_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Color color;

    @JoinColumn(name="id_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;

    public DetalleOrden() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidadProducir() {
        return cantidadProducir;
    }

    public void setCantidadProducir(int cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public int getPrendaId() {
        return prendaId;
    }

    public void setPrendaId(int prendaId) {
        this.prendaId = prendaId;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
