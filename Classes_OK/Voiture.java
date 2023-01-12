package agilite;


public class Voiture {
    private String marque;
    private String modele;
    private int vitesseMax;
    // private int vitesseActuelle;
  
    // public Voiture(String marque, String modele, int vitesseMax, int vitesseActuelle) {
    public Voiture(String marque, String modele, int vitesseMax, int vitesseActuelle) {
      this.marque = marque;
      this.modele = modele;
      this.vitesseMax = vitesseMax;
      // this.vitesseActuelle = vitesseActuelle;
    }
  
    public String getMarque() {
      return marque;
    }

    public void afficherMarque() {
      System.out.println(marque);
    }
  
    public void setMarque(String marque) {
      this.marque = marque;
    }
  
    public String getModele() {
      return modele;
    }
  
    public void setModele(String modele) {
      this.modele = modele;
    }
  
    public int getVitesseMax() {
      return vitesseMax;
    }
  
    public void setVitesseMax(int vitesseMax) {
      this.vitesseMax = vitesseMax;
    }

    // public int getVitesseActuelle() {
    //     return vitesseActuelle;
    // }

    // public void setVitesseActuelle(int i){
    //     this.vitesseActuelle=i;
    // }
  }
  


  