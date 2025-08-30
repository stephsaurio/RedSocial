package com.proyecto.redSocial.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "interaccion")
public class Interaccion implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5555992051319602290L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinteraccion")
    private Integer idinteraccion;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "publicacion_idpublicacion", referencedColumnName = "idpublicacion")
    private Publicacion publicacion;

    @ManyToOne
    @JoinColumn(name = "usuario_usuario", referencedColumnName = "usuario")
    private Usuario usuario;

    public Integer getIdinteraccion() {
        return idinteraccion;
    }

    public void setIdinteraccion(Integer idinteraccion) {
        this.idinteraccion = idinteraccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
