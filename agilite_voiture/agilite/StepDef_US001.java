package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Pilote;
import agilite.Voiture;

public class StepDef_US001 {
	
	
		Pilote p;
		Voiture v;

	
		@Given("je suis en train de créer un pilote")
		public void je_suis_en_train_de_creer_un_pilote() {
		// Initialiser les données de création du pilote, par exemple en créant un objet Pilote avec des valeurs par défaut
			
			p = new Pilote();
		}

		@When("je spécifie son nom, prénom, âge et une voiture")
		public void je_specifie_son_nom_prenom_age_et_une_voiture() {
		// Mettre à jour les données de création du pilote avec les valeurs spécifiées par l'utilisateur
			v = new Voiture("Peugeot","208",200,0);
			p = new Pilote("sari","mohand",24,v);
		}

		@Then("le pilote est créé avec ces informations")
		public void le_pilote_est_cree_avec_ces_informations() {
		// Vérifier que le pilote a été correctement créé avec les bonnes valeurs
			assertEquals("sari", p.getNom());
			assertEquals("mohand", p.getPrenom());
			assertEquals(23, p.getAge());
		}

		@Then("le pilote a une référence à une voiture")
		public void le_pilote_a_une_reference_a_une_voiture() {
		// Vérifier que le pilote a une référence à une voiture
			assertEquals(v, p.getVoiture());
		}

}
