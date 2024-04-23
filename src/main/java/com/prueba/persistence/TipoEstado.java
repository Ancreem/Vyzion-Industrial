package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_estado")
public class TipoEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "tipoEstado", cascade = CascadeType.ALL)
    private List<Estado> estados;

}