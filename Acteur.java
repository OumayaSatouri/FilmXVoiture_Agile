package agilite;

public class Acteur { 
	private int ID;
	private String nom;
	private Film film; 
	// ou une liste avec plusieurs films auquel il a joué??
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

// getFilm = film jouee
	public Film filmJouee() {
		return Film.getNom();
	}


	public void setFilm(Film film) {
		this.film = film;
	}

}
