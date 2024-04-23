package com.prueba.persistence;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Municipio> municipios;

    @JoinColumn(name="id_pais_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Pais pais;
}
