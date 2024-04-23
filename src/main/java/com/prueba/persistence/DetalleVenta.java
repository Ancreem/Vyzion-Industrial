package com.prueba.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name="id_venta_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Venta venta;

    @JoinColumn(name="id_producto_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Inventario inventario;

    @JoinColumn(name="id_talla_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Talla talla;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "valor_unit", nullable = false)
    private double valorUnit;

    public DetalleVenta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
}
