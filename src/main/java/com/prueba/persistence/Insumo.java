package com.prueba.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "insumo")
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor_unit", nullable = false)
    private double valorUnit;

    @Column(name = "stock_unit", nullable = false)
    private double stockUnit;

    @Column(name = "stock_max", nullable = false)
    private double stockMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(double stockUnit) {
        this.stockUnit = stockUnit;
    }

    public double getStockMax() {
        return stockMax;
    }

    public void setStockMax(double stockMax) {
        this.stockMax = stockMax;
    }
}




