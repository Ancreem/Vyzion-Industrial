package com.prueba.persistence;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "inventario_talla",                       // Crea la tabla intermedia o Muchos a muchos
            joinColumns = @JoinColumn(name = "id_inv_fk"), // Aca es la tabla del punto de partida
            inverseJoinColumns = @JoinColumn(name = "id_talla_fk") // Aca va la tabla inversa o espejo
    )
    private Set<Inventario> inventarios;

    @OneToMany(mappedBy = "talla", cascade = CascadeType.ALL)
    private List<DetalleVenta> DetalleVentas;

    public Talla() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(Set<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return DetalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        DetalleVentas = detalleVentas;
    }
}
