package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "insumo")
public class Insumo {

    @ManyToMany(mappedBy = "insumos", fetch = FetchType.EAGER) // Mapped hace referencia a quien va a Mapear
    private Set<Proveedor> proveedores;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "valor_unit", nullable = false)
    private double valorUnit;

    @Column(name = "stock_min", nullable = false)
    private double stock_min;

    @Column(name = "stock_max", nullable = false)
    private double stockMax;

    public Insumo() {
    }

    public Set<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(Set<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getStock_min() {
        return stock_min;
    }

    public void setStock_min(double stock_min) {
        this.stock_min = stock_min;
    }

    public double getStockMax() {
        return stockMax;
    }

    public void setStockMax(double stockMax) {
        this.stockMax = stockMax;
    }
}




