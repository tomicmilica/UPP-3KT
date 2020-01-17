package root.demo.model;

import model.Reviewer;

public class ReviewerDto {
	private Long id;

	private String city;

	private String country;

	private String email;

	private String name;

	private String password;

	private String surname;
	
	public ReviewerDto() {
	}

	public ReviewerDto(Reviewer reviewer) {
		
		this.setId((long)reviewer.getId());
		this.setCity(reviewer.getCity());
		this.setCountry(reviewer.getCountry());
		this.setEmail(reviewer.getEmail());
		this.setName(reviewer.getName());
		this.setSurname(reviewer.getSurname());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
