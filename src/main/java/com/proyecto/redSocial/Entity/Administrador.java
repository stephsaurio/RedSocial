package com.proyecto.redSocial.Entity;
import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8136615337179059860L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadministrador")
    private Integer idadministrador;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

	public Integer getIdadministrador() {
		return idadministrador;
	}

	public void setIdadministrador(Integer idadministrador) {
		this.idadministrador = idadministrador;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
