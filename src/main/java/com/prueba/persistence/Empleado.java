package com.prueba.persistence;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fecha_ingreso;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Orden> ordenes;

    @JoinColumn(name = "id_cargo_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Cargos cargos;

    @JoinColumn(name="id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;



}
