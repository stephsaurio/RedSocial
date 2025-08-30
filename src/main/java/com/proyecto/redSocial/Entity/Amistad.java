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
@Table (name = "amistad")
public class Amistad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 13505971377037154L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic (optional = false)
	@Column(name = "idamistad")
	private Integer idamistad;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "estado")
	private String estado;
	
	 // Relación muchos a uno con Usuario (primer usuario)
    @ManyToOne
    @JoinColumn(name = "usuario_usuario", referencedColumnName = "usuario") 
    private Usuario usuario;

    // Relación muchos a uno con Usuario (segundo usuario)
    @ManyToOne
    @JoinColumn(name = "usuario_usuario1", referencedColumnName = "usuario") 
    private Usuario usuario1;

	public Integer getIdamistad() {
		return idamistad;
	}

	public void setIdamistad(Integer idamistad) {
		this.idamistad = idamistad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
    
    
	
}
