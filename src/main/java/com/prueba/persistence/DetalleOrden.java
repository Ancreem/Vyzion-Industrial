package com.prueba.persistence;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad_producir", nullable = false)
    private int cantidadProducir;

    @Column(name = "prenda_id", nullable = false)
    private int prendaId;

    @Column(name = "cantidad_producida", nullable = false)
    private int cantidadProducida;


    @JoinColumn(name="id_orden_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Orden orden;

    @JoinColumn(name="id_prenda_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Prenda prenda;

    @JoinColumn(name="id_color_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Color color;

    @JoinColumn(name="id_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;

}
