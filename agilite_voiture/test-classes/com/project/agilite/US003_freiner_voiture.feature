Feature: US003_freiner_voiture

  Scenario: Freiner la voiture
    Given je suis un pilote en train de conduire une voiture
    When je spécifie une vitesse souhaitée pour freiner
    Then la vitesse de la voiture est modifiée en conséquence
    Et la vitesse de la voiture ne descend pas en dessous de zéro
