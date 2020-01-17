package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the scientific_area database table.
 * 
 */
@Entity
@Table(name="scientific_area")
@NamedQuery(name="ScientificArea.findAll", query="SELECT s FROM ScientificArea s")
public class ScientificArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="appuser_id_user")
	private int appuserIdUser;

	private String name;

	public ScientificArea() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAppuserIdUser() {
		return this.appuserIdUser;
	}

	public void setAppuserIdUser(int appuserIdUser) {
		this.appuserIdUser = appuserIdUser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}