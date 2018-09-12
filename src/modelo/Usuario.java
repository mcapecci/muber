package modelo;

import java.util.Date;

public abstract class Usuario {
	
	/**
	 * id del usuario
	 */
	private Long id;
	
	/**
	 * username
	 */
	private String username;
	
	/**
	 * password
	 */
	private String password;
	
	/**
	 * FechaIngreso
	 */
	private Date fechaIngreso;
	
	/**
	 * Constructor vacío.
	 */
	public Usuario(){}

	/**
	 * Getter.
	 * 
	 * @return el id del usuario.
	 */
	public Long getId() {
	  return id;
	}

	/**
	 * Setter.
	 * 
	 * @param id
	 *			es el id del usuario.
	 */
	public void setId(Long id) {
	  this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
}
