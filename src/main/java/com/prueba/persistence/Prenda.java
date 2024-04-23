package com.prueba.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "valor_unit_cop", nullable = false)
    private double valorUnitCop;

    @Column(name = "valor_unit_usd", nullable = false)
    private double valorUnitUsd;

    @Column(name = "id_estado_fk", nullable = false)
    private double idEstadoFk;

    @Column(name = "id_tipo_proteccion", nullable = false)
    private double idTipoProteccion;

    @Column(name = "id_genero_fk", nullable = false)
    private double idGeneroFk;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorUnitCop() {
        return valorUnitCop;
    }

    public void setValorUnitCop(double valorUnitCop) {
        this.valorUnitCop = valorUnitCop;
    }

    public double getValorUnitUsd() {
        return valorUnitUsd;
    }

    public void setValorUnitUsd(double valorUnitUsd) {
        this.valorUnitUsd = valorUnitUsd;
    }

    public double getIdEstadoFk() {
        return idEstadoFk;
    }

    public void setIdEstadoFk(double idEstadoFk) {
        this.idEstadoFk = idEstadoFk;
    }

    public double getIdTipoProteccion() {
        return idTipoProteccion;
    }

    public void setIdTipoProteccion(double idTipoProteccion) {
        this.idTipoProteccion = idTipoProteccion;
    }

    public double getIdGeneroFk() {
        return idGeneroFk;
    }

    public void setIdGeneroFk(double idGeneroFk) {
        this.idGeneroFk = idGeneroFk;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
