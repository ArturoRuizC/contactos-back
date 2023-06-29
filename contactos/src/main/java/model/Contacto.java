package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the contactos database table.
 * 
 */
@Entity
@Table(name="contactos")
@NamedQuery(name="Contacto.findAll", query="SELECT c FROM Contacto c")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String aMaterno;

	private String aPaterno;

	private int edad;

	private String email;

	private String nombre;

	private String telefono;

	public Contacto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAMaterno() {
		return this.aMaterno;
	}

	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getAPaterno() {
		return this.aPaterno;
	}

	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}