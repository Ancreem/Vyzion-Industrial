package com.prueba.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @JoinColumn(name="id_empleado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Empleado empleado;

    @JoinColumn(name="id_cliente_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @JoinColumn(name="id_forma_pago_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private FormaPago formaPago;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalleVentas;
}
