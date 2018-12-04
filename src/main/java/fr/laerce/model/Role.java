package fr.laerce.model;

public class Role{
private Film film;
private Personne personne;
String titre, alias;

    public Role(Film film, Personne personne, String titre, String alias) {
        this.film = film;
        this.personne = personne;
        this.titre = titre;
        this.alias = alias;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
