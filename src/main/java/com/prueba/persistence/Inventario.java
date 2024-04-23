package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "inventario")
public class Inventario {

    @ManyToMany(mappedBy = "inventarios", fetch = FetchType.EAGER) // Mapped hace referencia a quien va a Mapear
    private Set<Talla> tallas;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cod_inv", nullable = false)
    private String codInv;

    @Column(name = "valor_vta_cop", nullable = false)
    private double valorVtaCop;

    @Column(name = "valor_vta_usd", nullable = false)
    private double valorVtaUsd;

    @JoinColumn(name="id_prenda_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Prenda prenda;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    private List<DetalleVenta> DetalleVentas;


}