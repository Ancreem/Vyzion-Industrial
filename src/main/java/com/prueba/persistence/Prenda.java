package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;

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

    @JoinColumn(name="id_estado_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;

    @JoinColumn(name="id_tipo_proteccion", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProteccion tipoProteccion;

    @JoinColumn(name="id_genero_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Genero genero;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @OneToMany(mappedBy = "prenda", cascade = CascadeType.ALL)
    private List<Inventario> inventarios;

    public Prenda() {
    }

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoProteccion getTipoProteccion() {
        return tipoProteccion;
    }

    public void setTipoProteccion(TipoProteccion tipoProteccion) {
        this.tipoProteccion = tipoProteccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }
}
