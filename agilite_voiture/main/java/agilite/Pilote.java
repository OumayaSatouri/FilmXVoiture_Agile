package agilite;


public class Pilote {
    private String nom;
    private String prenom;
    private int age;
    private Voiture voiture;
    
    public Pilote() {
    	this.nom = null;
        this.prenom = null;
        this.age = 0;
        this.voiture = null;
    }
  
    public Pilote(String nom, String prenom, int age, Voiture voiture) {
      this.nom = nom;
      this.prenom = prenom;
      this.age = age;
      this.voiture = voiture;
    }
  
    public String getNom() {
      return nom;
    }
  
    public void setNom(String nom) {
      this.nom = nom;
    }
  
    public String getPrenom() {
      return prenom;
    }
  
    public void setPrenom(String prenom) {
      this.prenom = prenom;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    public Voiture getVoiture() {
      return voiture;
    }
  
    public void setVoiture(Voiture voiture) {
      this.voiture = voiture;
    }

    public void conduire(int i) {
        this.voiture.setVitesseActuelle(i);
    }

    public void freiner(int i) {
        this.voiture.setVitesseActuelle(i);
    }
  }
  