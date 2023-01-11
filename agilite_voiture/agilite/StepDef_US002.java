package com.project.agilite;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDef_US002 {

	
	@Given("je suis un pilote en train de conduire une voiture")
	public void je_suis_un_pilote_en_train_de_conduire_une_voiture() {
	// Initialiser le pilote et la voiture en cours de conduite, par exemple en récupérant des objets Pilote et Voiture existants dans un contexte de test
	}

	@When("je spécifie une vitesse souhaitée")
	public void je_specifie_une_vitesse_souhaitee() {
	// Récupérer la vitesse souhaitée spécifiée par l'utilisateur et l'utiliser pour mettre à jour la vitesse de la voiture en cours de conduite
	}

	@Then("la vitesse de la voiture est modifiée en conséquence")
	public void la_vitesse_de_la_voiture_est_modifiee_en_consequence() {
	// Vérifier que la vitesse de la voiture a été modifiée en conséquence de la vitesse souhaitée spécifiée par l'utilisateur
	}

	@Then("la vitesse de la voiture ne dépasse pas la vitesse maximale de la voiture")
	public void la_vitesse_de_la_voiture_ne_depasse_pas_la_vitesse_maximale_de_la_voiture() {
	// Vérifier que la vitesse de la voiture ne dépasse pas la vitesse maximale de la voiture
	}
}
