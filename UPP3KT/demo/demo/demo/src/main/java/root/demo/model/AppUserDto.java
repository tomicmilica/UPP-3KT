package root.demo.model;

import model.Appuser;

public class AppUserDto {

	private Long id;
	
	private String city;
	
	private String country;

	private String email;
	
	private String name;
	
	private String surname;
	
	private String password;
	
	public AppUserDto() {
	}
	
public AppUserDto(Appuser user) {
		
		this.setCity(user.getCity());
		this.setEmail(user.getEmail());
		this.name = user.getName();
		this.surname = user.getName();
		this.setPassword(user.getPassword());
		//this.country(user.getCountry());
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
