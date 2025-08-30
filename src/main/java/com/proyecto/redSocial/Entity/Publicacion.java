package com.proyecto.redSocial.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table (name = "publicacion")
public class Publicacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2172763932708582131L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic (optional = false)
	@Column(name = "idpublicacion")
	private Integer idpublicacion;
	
	@Column(name = "texto")
	private String texto;
	
	@Lob
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "usuario_usuario")
	private String usuarioUsuario;
	
	@ManyToOne
	@JoinColumn(name = "usuario_usuario", referencedColumnName = "usuario", insertable = false, updatable = false)
	private Usuario usuario;

	@OneToMany(mappedBy = "publicacion")
	private List<Interaccion> interacciones;

	@OneToMany(mappedBy = "publicacion")
	private List<Comentario> comentarios;

	public Integer getIdpublicacion() {
		return idpublicacion;
	}

	public void setIdpublicacion(Integer idpublicacion) {
		this.idpublicacion = idpublicacion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFecha() { return fecha; }
	

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuarioUsuario() {
		return usuarioUsuario;
	}

	public void setUsuarioUsuario(String usuarioUsuario) {
		this.usuarioUsuario = usuarioUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Interaccion> getInteracciones() {
		return interacciones;
	}

	public void setInteracciones(List<Interaccion> interacciones) {
		this.interacciones = interacciones;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}


}
