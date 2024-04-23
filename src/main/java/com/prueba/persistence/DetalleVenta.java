package com.prueba.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name="id_venta_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Venta venta;

    @JoinColumn(name="id_producto_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Inventario inventario;

    @JoinColumn(name="id_talla_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Talla talla;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "valor_unit", nullable = false)
    private double valorUnit;
}
