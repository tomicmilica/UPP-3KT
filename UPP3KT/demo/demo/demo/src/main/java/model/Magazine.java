package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the magazine database table.
 * 
 */
@Entity
@NamedQuery(name="Magazine.findAll", query="SELECT m FROM Magazine m")
public class Magazine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_magazine")
	private Long idMagazine;

	@Column(name="editor_id_editor")
	private int editorIdEditor;

	@Column(name="open_access")
	private byte openAccess;

	private String title;

	public Magazine() {
	}

	public Long getId() {
		return this.idMagazine;
	}

	public void setId(Long idMagazine) {
		this.idMagazine = idMagazine;
	}

	public int getEditorIdEditor() {
		return this.editorIdEditor;
	}

	public void setEditorIdEditor(int editorIdEditor) {
		this.editorIdEditor = editorIdEditor;
	}

	public byte getOpenAccess() {
		return this.openAccess;
	}

	public void setOpenAccess(byte openAccess) {
		this.openAccess = openAccess;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}