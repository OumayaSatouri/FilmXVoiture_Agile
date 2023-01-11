
Feature: US002_conduire_voiture

  Scenario: Conduire la voiture
    Given je suis un pilote en train de conduire une voiture
    When je spécifie une vitesse souhaitée
    Then la vitesse de la voiture est modifiée en conséquence 
    Et la vitesse de la voiture ne dépasse pas la vitesse maximale de la voiture