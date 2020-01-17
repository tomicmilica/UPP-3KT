package root.demo.model;

import model.Magazine;

public class MagazineDto {

private Long id;
	
	private String name;
	
	private byte openAccess;
	
	private String title;

	private ScientificAreaDto scientificArea;

	private EditorDto editor;
	
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

	public byte getOpenAccess() {
		return openAccess;
	}

	public void setOpenAccess(byte openAccess) {
		this.openAccess = openAccess;
	}
		
	public MagazineDto(Magazine magazine) {
			
			this.setId(magazine.getId());
			this.setOpenAccess(magazine.getOpenAccess());
			this.setTitle(magazine.getTitle());
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ScientificAreaDto getScientificArea() {
		return scientificArea;
	}
	
	public void setScientificArea(ScientificAreaDto scientificArea) {
		this.scientificArea = scientificArea;
	}
	
	public EditorDto getEditor() {
		return editor;
	}
	
	public void setEditor(EditorDto editor) {
		this.editor = editor;
	}
}
