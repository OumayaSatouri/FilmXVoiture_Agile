package agilite;

public class Film {
	private String nom;
	private String genre;
	private String duree;
	private int note;
	private Acteur alex;
	private int nombreVisionnage;

	public void Acteur() { // ca doit pas etre une liste d'acteur? pr povoir faire la somme pr nbr d'acteur?
		this.nom = null;
		this.genre = null; 
		this.duree = null;
		this.note = 0;	
	}
	
	public String getNom() {
		return nom;
	}

	public Acteur getAlex() {
		return alex;
	}

	public void setAlex(Acteur alex) {
		this.alex = alex;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;	
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		if(note < 1 || note > 10)
			System.out.println("SVP entrez une note valide entre 1 et 10");
		else
			this.note = note;
	}

	public String getNombreVisionnage() {
		return nombreVisionnage;
	}
	
	public void setDuree(int nombreVisionnage) {
		this.nombreVisionnage = nombreVisionnage;
	}


}
