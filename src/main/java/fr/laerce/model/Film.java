package fr.laerce.model;

import java.util.Objects;

public class Film {
    private String titre;
    private Double notation;
    private String affiche;
    private String resume;
    private Personne realisateur;

    public Film(String titre, Double notation, String affiche, String resume, Personne realisateur) {
        this.titre = titre;
        this.notation = notation;
        this.resume = resume;
        this.realisateur = realisateur;
    }

    public Film() {
    }

    public String getTitre(String titre) {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getNotation() {
        return notation;
    }

    public void setNotation(Double notation) {
        this.notation = notation;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Personne getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Personne realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Objects.equals(getTitre("titre"), film.getTitre("titre")) &&
                Objects.equals(getNotation(), film.getNotation()) &&
                Objects.equals(getResume(), film.getResume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitre("titre"), getNotation(), getResume());
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", notation=" + notation +
                ", resume='" + resume + '\'' +
                ", realisateur=" + realisateur +
                '}';
    }

    public void addRole(Role role) {
    }
}
