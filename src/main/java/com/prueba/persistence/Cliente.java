package com.prueba.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "id_cliente", nullable = false)
    private String idCliente;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

    @JoinColumn(name="id_tipo_persona_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPersona tipoPersona;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Orden> ordenes;

    @JoinColumn(name="id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;
}
