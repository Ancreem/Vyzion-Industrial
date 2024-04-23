package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

//    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
//    private List<Prenda> prendas;

    @JoinColumn(name="id_tipo_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoEstado tipoEstado;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Orden> ordenes;



}