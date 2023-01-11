package com.project.agilite;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDef_US004 {

	
	@Given("je suis un pilote en train de conduire une voiture")
	public void je_suis_un_pilote_en_train_de_conduire_une_voiture() {
	// Initialiser le pilote et la voiture en cours de conduite, par exemple en récupérant des objets Pilote et Voiture existants dans un contexte de test
	}

	@When("je veux accéder aux informations de la voiture (marque, modèle, vitesse maximale, vitesse actuelle)")
	public void je_veux_acceder_aux_informations_de_la_voiture() {
	// Récupérer les informations de la voiture en cours de conduite (par exemple en appelant des méthodes get sur l'objet Voiture)
	}

	@Then("je peux accéder à ces informations")
	public void je_peux_acceder_a_ces_informations() {
	// Vérifier que les informations de la voiture ont bien été récupérées et sont disponibles pour l'utilisateur
	}
}
