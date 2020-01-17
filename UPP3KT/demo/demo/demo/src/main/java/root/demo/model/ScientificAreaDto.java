package root.demo.model;

import java.util.List;


import model.ScientificArea;

public class ScientificAreaDto {
	private Long id;

	private String name;

	private List<EditorDto> editors;

	private List<MagazineDto> magazines;

	private List<ReviewerDto> reviewers;

	public ScientificAreaDto() {
		
	}
	
	public ScientificAreaDto(ScientificArea sciArea) {
		this.setId((long) sciArea.getId());
		this.setName(sciArea.getName());
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
	
	public List<EditorDto> getEditors() {
		return editors;
	}
	public void setEditors(List<EditorDto> editors) {
		this.editors = editors;
	}

	public List<MagazineDto> getMagazines() {
		return magazines;
	}

	public void setMagazines(List<MagazineDto> magazines) {
		this.magazines = magazines;
	}

	public List<ReviewerDto> getReviewers() {
		return reviewers;
	}

	public void setReviewers(List<ReviewerDto> reviewers) {
		this.reviewers = reviewers;
	}

}
