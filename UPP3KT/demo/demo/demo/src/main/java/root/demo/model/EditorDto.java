package root.demo.model;

import java.util.List;

import model.Editor;

public class EditorDto {
	private Long id;

	private String city;

	private String country;

	private String email;

	private String name;

	private String password;

	private String surname;

	private List<ScientificAreaDto> scientificAreas;
	
public EditorDto() {
		
	}
	
	public EditorDto(Editor editor) {
		this.setId(editor.getId());
		this.setCity(editor.getCity());
		this.setCountry(editor.getCountry());
		this.setName(editor.getName());
		this.setSurname(editor.getSurname());
		this.setEmail(editor.getEmail());
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<ScientificAreaDto> getScientificAreas() {
		return scientificAreas;
	}

	public void setScientificAreas(List<ScientificAreaDto> scientificAreas) {
		this.scientificAreas = scientificAreas;
	}
}
