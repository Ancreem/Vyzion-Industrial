package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "valor_unit_cop", nullable = false)
    private double valorUnitCop;

    @Column(name = "valor_unit_usd", nullable = false)
    private double valorUnitUsd;

    @JoinColumn(name="id_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;

    @JoinColumn(name="id_tipo_proteccion", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProteccion tipoProteccion;

    @JoinColumn(name="id_genero_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Genero genero;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @OneToMany(mappedBy = "prenda", cascade = CascadeType.ALL)
    private List<Inventario> inventarios;

}
