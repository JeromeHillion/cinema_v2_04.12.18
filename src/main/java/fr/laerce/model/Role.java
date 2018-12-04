package fr.laerce.model;

public class Role{

    private Integer place;
    private  String nom;
    private Personne personne;
    private Film film;

    public Role(Integer place, String nom, Personne personne, Film film) {
        this.place = place;
        this.nom = nom;
        this.personne = personne;
        this.film = film;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Role{" +
                "place=" + place +
                ", nom='" + nom + '\'' +
                ", personne=" + personne.getNom() +
                ", film=" + film.getTitre() +
                '}';
    }
}
