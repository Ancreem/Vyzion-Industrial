package com.prueba.persistence;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JoinColumn(name="id_departamento_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Departamento departamento;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private List<Empresa> empresas;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private List<Proveedor> proveedores;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

}
