package com.prueba.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nit", nullable = false)
    private String nit;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "representante_legal", nullable = false)
    private String representanteLegal;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @JoinColumn(name = "id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;


}
