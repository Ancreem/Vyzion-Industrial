package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_persona")
public class TipoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tipoPersona", cascade = CascadeType.ALL)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "tipoPersona", cascade = CascadeType.ALL)
    private List<Proveedor> proveedores;
}
