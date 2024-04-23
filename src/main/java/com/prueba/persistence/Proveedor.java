package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "proveedor")
public class Proveedor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nit_proveedor", nullable = false)
    private String nitProveedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JoinColumn(name="id_tipo_persona_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPersona tipoPersona;

    @JoinColumn(name="id_municipio_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipio municipio;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "insumo_proveedor",
            joinColumns = @JoinColumn(name = "id_insumo_fk"),
            inverseJoinColumns = @JoinColumn(name = "id_proveedor_fk")
    )
    private Set<Insumo> insumos;

    public Proveedor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Set<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(Set<Insumo> insumos) {
        this.insumos = insumos;
    }
}
