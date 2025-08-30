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
@Table(name = "comentario") 
public class Comentario implements Serializable {

    private static final long serialVersionUID = -7549237851038257837L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomentario")
    private Integer idcomentario;

    @Column(name = "texto")
    private String texto;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne //relacion con publicacion (mucho a uno)
    @JoinColumn(name = "publicacion_idpublicacion", referencedColumnName = "idpublicacion")
    private Publicacion publicacion;

    @ManyToOne //relacion con usuarjo (mucho a uno)
    @JoinColumn(name = "usuario_usuario", referencedColumnName = "usuario")
    private Usuario usuario;

    public Comentario() {}

    public Integer getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(Integer idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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


