package com.prueba.persistence;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cargos")
public class Cargos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "sueldo_base", nullable = false)
    private double sueldoBase;

    @OneToMany(mappedBy = "cargos", cascade = CascadeType.ALL)
    private List<Empleado> empleados;


}
