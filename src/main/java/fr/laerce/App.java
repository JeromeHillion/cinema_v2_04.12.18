package fr.laerce;

import fr.laerce.model.Film;
import fr.laerce.model.Personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Personne> personnes = new ArrayList<>();
        List<Film> films = new ArrayList<>();
        Film film = new Film();
        System.out.println( film.getTitre("titre") );
    }

}
