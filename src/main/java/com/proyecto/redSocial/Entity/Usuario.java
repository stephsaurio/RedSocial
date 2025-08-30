package com.proyecto.redSocial.Entity;

import java.io.Serializable;
import java.util.List;

import com.proyecto.redSocial.Entity.Amistad;
import com.proyecto.redSocial.Entity.Comentario;
import com.proyecto.redSocial.Entity.Interaccion;
import com.proyecto.redSocial.Entity.Publicacion;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "usuario") //nombre de la tabla mysql
public class Usuario implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -4186715558647930353L;

	@Id
	@Basic(optional = false)
	@Column (name = "usuario")
    private String usuario; // clave primaria

	@Column (name = "nombre")
    private String nombre;
	
	@Column (name = "email")
    private String email;
	
	@Column (name = "estado")
    private String estado;
	
	@Column (name = "password")
    private String password;


	@OneToMany(mappedBy = "usuario")
	private List<Amistad> amistadesEnviadasList;

	@OneToMany(mappedBy = "usuario1")
	private List<Amistad> amistadesRecibidasList;

	    @OneToMany(mappedBy = "usuario")
	    private List<Interaccion> interaccionesList;

	    @OneToMany(mappedBy = "usuario")
	    private List<Publicacion> publicacionesList;

	    @OneToMany(mappedBy = "usuario")
	    private List<Comentario> comentariosList;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

   
}
