package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the editor database table.
 * 
 */
@Entity
@NamedQuery(name="Editor.findAll", query="SELECT e FROM Editor e")
public class Editor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_editor")
	private Long idEditor;

	private String city;

	private String country;

	private String email;

	private String name;

	private String surname;

	public Editor() {
	}

	public Long getId() {
		return this.idEditor;
	}

	public void setId(Long idEditor) {
		this.idEditor = idEditor;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}