package agilite;

import java.util.*;

public class Film {
	private String nom;
	private String genre;
	private int duree;
	private int note;
	private Acteur[] listActeur;
	private Voiture[] listVoiture;
	private int nombreVisionnage = 0;
	private Film filmSuivant;

	public Film(String nom) {
		this.nom = nom;
		this.genre = null; 
		this.duree = null;
		this.note = 0;
		this.listActeur = new Acteur[20];	
		this.listVoiture = new Voiture[20];	
		this.filmSuivant = null;
	}

	public Film(String nom, String genre, int duree) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = 0;
		this.listActeur = new Acteur[20];
		this.listVoiture = new Voiture[20];	
		this.filmSuivant = null;	
	}

	public Film(String nom, String genre, int duree, int note) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = new Acteur[20];
		this.listVoiture = new Voiture[20];
		this.filmSuivant = null;
	}

	public Film(String nom, String genre, int duree, int note, Acteur[] listActeur) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = listActeur;
		this.listVoiture = listVoiture;
		this.filmSuivant = null;	
	}

	public Film(String nom, String genre, int duree, int note, Acteur[] listActeur, Film filmSuivant) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = listActeur;
		this.listVoiture = listVoiture;
		this.filmSuivant = filmSuivant;	
	}

	
	public String getNom() {
		return nom;
	}

	public void afficherNom() {
		System.out.println(nom);
	}

	public void afficheActeur() {
		for (int i = 0; i < listActeur.length; i++) {
			system.out.println(listActeur[i]); 
		}
	}

	public void afficheVoiture() {
		for (int i = 0; i < listVoiture.length; i++) {
			system.out.println(listVoiture[i]); 
		}
	}

	public int comptePilote() {
		int cpt = 0;
		for (int i = 0; i < listActeur.length; i++) {
			if(listActeur[i].isPilote()) {
				cpt++;
			} 
		}
		return cpt;
	}

	public int getNombreActeur() {
		return listActeur.length;
	}

	public void afficheNombreActeur() {
		System.out.println(listActeur.length);
	}

	// public void addActeur(Acteur alex) {
	// 	this.listActeur. ;
	// }

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;	
	}

	public void afficgeGenre() {
		System.out.println(genre);
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDuree() {
		return duree;
	}

	public void afficheDuree() {
		System.out.println(duree);
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public int getNote() {
		return note;
	}

	public void afficheNote() {
		System.out.println(note);
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

	public void afficheVisionnage() {
		System.out.println(nombreVisionnage);
	}
	
	public void regarder() {
		this.nombreVisionnage++;
	}

	public Film getFilmSuivant() {
		return filmSuivant;
	}

	public void setFilmSuivant(FilmSuivant filmSuivant) {
		this.filmSuivant = filmSuivant;
	}

	public void afficheFilmSuivant() {
		System.out.println(filmSuivant);
	}


}
