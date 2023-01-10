package agilite;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test FilmTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */


public class FilmTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double film1;
    protected double film2;

    /**
     * Constructeur de la classe-test FilmTest
     */
    public FilmTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        film1= 2.0;
        film2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void genreFilmTest()
    {
        assertEquals("Le film",film1.getNom(),"est de genre: ", film1.getGenre());
    }

    @Test
    public void dureeFilmTest()
    {
        assertEquals("Le film",film1.getNom()," dure: ", film1.getDuree());
    }

    @Test
    public void noteFilmTest()
    {
        assertEquals("Le film",film1.getNom()," a une note de: ", film1.getNote());
    }
}

