package com.cine.rest.Modal;
import java.util.List;

public class Movie {

    //Variable
    private int id; //ID du film
    private int duration; //Durée du film
    private String title; //Titre du film
    private String language; // Langue en forme ISO
    private String subtitles; //Présence de sous-titre
    private String director; // Réalisateur - Directeur du film
    private List<String> mainActors; //Acteurs principaux
    private int minAge; //Âge minimum pour voir le film
    private String city; //Ville de diffusion
    private String startAt; //Heure de séance de diffusion
    private String endAt; //Heure de fin de diffusion
    private List<Session> sessions; //Liste des sessions
    private String image; //Image de preview du film

    //Methodes
    public Movie(){}

    // Get/Set ID du film
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    // Get/Set de la durée
    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    // Get/Set du titre
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    // Get/Set de la langue
    public String getLanguage() {return language;}
    public void setLanguage(String language) {this.language = language;}

    // Get/Set des sous-titres
    public String getSubtitles() {return subtitles;}
    public void setSubtitles(String subtitles) {this.subtitles = subtitles;}

    // Get/Set du réalisateur / directeur
    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    // Get/Set des acteurs principaux
    public List<String> getMainActors() {return mainActors;}
    public void setMainActors(List<String> mainActors) {this.mainActors = mainActors;}

    // Get/Set de l'âge minimum
    public int getMinAge() {return minAge;}
    public void setMinAge(int minAge) {this.minAge = minAge;}

    // Get/Set de la ville
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    // Get/Set de l'heure de début de la séance
    public String getStartAt() {return startAt;}
    public void setStartAt(String startAt) {this.startAt = startAt;}

    // Get/Set de l'heure de fin de la séance
    public String getEndAt() {return endAt;}
    public void setEndAt(String endAt) {this.endAt = endAt;}

    // Get/Set de la liste des sessions
    public List<Session> getSessions() {return sessions;}
    public void setSessions(List<Session> sessions) {this.sessions = sessions;}

    // Get/Set Image
    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}
}
