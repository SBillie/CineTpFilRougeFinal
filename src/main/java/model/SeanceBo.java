package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeanceBo {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String film;
	private String heureSeance;
	private String Categorie;
	
	public SeanceBo() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public String getHeureSeance() {
		return heureSeance;
	}

	public void setHeureSeance(String heureSeance) {
		this.heureSeance = heureSeance;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	
	

}
