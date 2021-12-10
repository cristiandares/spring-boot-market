package com.cristiandares.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId // esta anotacion se usa cuando la clave primaria es compuesta, se crea una clase para las dos PK
    private ComprasProductoPK comprasProductoPK;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Double total;

    @Column(name = "estado")
    private Boolean estado;

    public ComprasProductoPK getComprasProductoPK() {
        return comprasProductoPK;
    }

    public void setComprasProductoPK(ComprasProductoPK comprasProductoPK) {
        this.comprasProductoPK = comprasProductoPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
