package agilite;

public class Acteur { 
	public static int compteur = 0;
	private int id;
	private String nom;
	private Film film; 
	// ou une liste avec plusieurs films auquel il a joué??

	public Acteur(String nom) {
		this.nom = nom;
		this.film = null;
		compteur++;
		this.ID = compteur;
	}

	public Acteur(String nom, String film) {
		this.nom = nom;
		this.film = film;
		compteur++;
		this.ID = compteur;
	}
	

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
		return this.film.getNom();
	}


	public void setFilm(Film film) {
		this.film = film;
	}

	public boolean isPilote() {
		return false;
	}

}
