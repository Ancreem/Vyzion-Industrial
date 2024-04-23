package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "proveedor")
public class Proveedor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nit_proveedor", nullable = false)
    private String nitProveedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JoinColumn(name="id_tipo_persona_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPersona tipoPersona;

    @JoinColumn(name="id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "insumo_proveedor",
            joinColumns = @JoinColumn(name = "id_insumo_fk"),
            inverseJoinColumns = @JoinColumn(name = "id_proveedor_fk")
    )
    private Set<Insumo> insumos;


}
