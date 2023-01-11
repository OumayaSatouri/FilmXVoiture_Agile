package com.project.agilite;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDef_US003 {

	
	@Given("je suis un pilote en train de conduire une voiture")
	public void je_suis_un_pilote_en_train_de_conduire_une_voiture() {
	// Initialiser le pilote et la voiture en cours de conduite, par exemple en récupérant des objets Pilote et Voiture existants dans un contexte de test
	}

	@When("je spécifie une vitesse souhaitée pour freiner")
	public void je_specifie_une_vitesse_souhaitee_pour_freiner() {
	// Récupérer la vitesse souhaitée spécifiée par l'utilisateur et l'utiliser pour mettre à jour la vitesse de la voiture en cours de conduite
	}

	@Then("la vitesse de la voiture est modifiée en conséquence")
	public void la_vitesse_de_la_voiture_est_modifiee_en_consequence() {
	// Vérifier que la vitesse de la voiture a été modifiée en conséquence de la vitesse souhaitée spécifiée par l'utilisateur
	}

	@Then("la vitesse de la voiture ne descend pas en dessous de zéro")
	public void la_vitesse_de_la_voiture_ne_descend_pas_en_dessous_de_zero() {
	// Vérifier que la vitesse de la voiture ne descend pas en dessous de zéro
	}
}
