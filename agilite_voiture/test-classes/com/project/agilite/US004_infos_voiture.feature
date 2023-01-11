Feature: US004_infos_voiture

  Scenario: Accéder aux informations de la voiture
    Given je suis un pilote en train de conduire une voiture
    When je veux accéder aux informations de la voiture (marque, modèle, vitesse maximale, vitesse actuelle)
    Then je peux accéder à ces informations
  

