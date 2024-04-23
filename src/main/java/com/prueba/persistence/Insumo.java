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

}




