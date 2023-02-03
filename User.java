package edu.mx.utvt.data.entities;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="te_usuarios")

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1404196032355826519L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )	
	private Long id;
	@Column (name="nombre", nullable =false,unique=true)
    private String nombre;
	@Column (name="contrasena", nullable =false)
	private String contrasena;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getcontrasena() {
		return contrasena;
	}

	public void setcontrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public User() {
		//TODO Auto-generate constructor stud
	}

	public User(String nombre,String contrasena) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
}

