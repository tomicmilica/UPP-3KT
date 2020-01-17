package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reviewer database table.
 * 
 */
@Entity
@NamedQuery(name="Reviewer.findAll", query="SELECT r FROM Reviewer r")
public class Reviewer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_reviewer")
	private Long idReviewer;

	private String city;

	private String country;

	private String email;

	private String name;

	private String surname;

	public Reviewer() {
	}

	public Long getId() {
		return this.idReviewer;
	}

	public void setId(Long idReviewer) {
		this.idReviewer = idReviewer;
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