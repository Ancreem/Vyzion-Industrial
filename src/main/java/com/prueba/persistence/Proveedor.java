package com.prueba.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nip_proveedor", nullable = false)
    private String nipProveedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JoinColumn(name="id_tipo_persona_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPersona tipoPersona;

    @JoinColumn(name="id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;


}