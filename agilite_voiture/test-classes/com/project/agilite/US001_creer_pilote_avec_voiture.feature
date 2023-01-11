Feature: US001_creer_pilote_avec_voiture

  Scenario: Créer un pilote avec une voiture
    Given je suis en train de créer un pilote
    When je spécifie son nom, prénom, âge et une voiture
    Then le pilote est créé avec ces informations 
    Et le pilote a une référence à une voiture