package com.prueba.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @JoinColumn(name="id_empleado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Empleado empleado;

    @JoinColumn(name="id_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;

    @JoinColumn(name="id_cliente_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    public Orden() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
