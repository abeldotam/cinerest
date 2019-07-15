package com.cine.rest.Controller;
import com.cine.rest.Modal.Movie;
import com.cine.rest.Modal.Session;
import java.util.ArrayList;
import java.util.List;

public class moviesDatabase {

    private List<Movie> list = new ArrayList<Movie>();

    private moviesDatabase(){
        Movie movie1 = new Movie();
        movie1.setId(0);
        movie1.setDuration(120);
        movie1.setTitle("Harry Potter and the Forbidden Journey");
        movie1.setLanguage("fr-FR");
        movie1.setSubtitles("fr-FR");
        movie1.setDirector("Bruce Willis");
        movie1.setMinAge(18);
        movie1.setCity("Lyon");
        movie1.setStartAt("2018-01-06T05:45:03");
        movie1.setEndAt("2018-01-10T05:45:03");
        List<String> actors1 = new ArrayList<String>();
        actors1.add("Daniel Radcliff");
        actors1.add("Voldemor");
        actors1.add("Bruce Willis");
        movie1.setMainActors(actors1);
        Session s1 = new Session("Monday", "12:00");
        Session s2 = new Session("Thusday", "12:00");
        Session s3 = new Session("Thursday", "12:00");
        List<Session> listSession1 = new ArrayList<Session>();
        listSession1.add(s1);
        listSession1.add(s2);
        listSession1.add(s3);
        movie1.setSessions(listSession1);
        movie1.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BNDM0YzMyNGUtMTU1Yy00OTE2LWE5NzYtZDZhMTBmN2RkNjg3XkEyXkFqcGdeQXVyMzU5NjU1MDA@._V1_SX300.jpg");


        Movie movie2 = new Movie();
        movie2.setId(1);
        movie2.setDuration(140);
        movie2.setTitle("Harry Potter and the Chamber of Secrets");
        movie2.setLanguage("fr-FR");
        movie2.setSubtitles("fr-FR");
        movie2.setDirector("Ernest Lavigne");
        movie2.setMinAge(18);
        movie2.setCity("Paris");
        movie2.setStartAt("2018-01-04T05:45:03");
        movie2.setEndAt("2018-01-14T05:45:03");
        List<String> actors2 = new ArrayList<String>();
        actors2.add("Barack Obama");
        actors2.add("Vladimir Putin");
        actors2.add("Emmanuel Macron,");
        movie2.setMainActors(actors2);
        Session s4 = new Session("Monday", "14:00");
        Session s5 = new Session("Friday", "16:00");
        Session s6 = new Session("Thursday", "18:00");
        List<Session> listSession2 = new ArrayList<Session>();
        listSession2.add(s4);
        listSession2.add(s5);
        listSession2.add(s6);
        movie2.setSessions(listSession2);
        movie2.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BNTM4NzQ2NjA4NV5BMl5BanBnXkFtZTgwODAwMjE4MDE@._V1_SX300.jpg");



        Movie movie3 = new Movie();
        movie3.setId(2);
        movie3.setDuration(130);
        movie3.setTitle("Harry Potter and the Half-Blood Prince");
        movie3.setLanguage("us-US");
        movie3.setSubtitles("fr-FR");
        movie3.setDirector("Laurent Le Boucher");
        movie3.setMinAge(16);
        movie3.setCity("Marseille");
        movie3.setStartAt("2018-01-07T05:45:03");
        movie3.setEndAt("2018-01-17T05:45:03");
        List<String> actors3 = new ArrayList<String>();
        actors3.add("Alexandre Dumas");
        actors3.add("Arthur Rimbaud");
        actors3.add("Steve Jobs,");
        movie3.setMainActors(actors3);
        Session s7 = new Session("Thuesday", "08:00");
        Session s8 = new Session("Wednesday", "10:00");
        Session s9 = new Session("Thursday", "20:00");
        List<Session> listSession3 = new ArrayList<Session>();
        listSession3.add(s7);
        listSession3.add(s8);
        listSession3.add(s9);
        movie3.setSessions(listSession3);
        movie3.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BNzU3NDg4NTAyNV5BMl5BanBnXkFtZTcwOTg2ODg1Mg@@._V1_SX300.jpg");


        Movie movie4 = new Movie();
        movie4.setId(3);
        movie4.setDuration(110);
        movie4.setTitle("Harry Potter and the Deathly Hallows: Part 1");
        movie4.setLanguage("fr-FR");
        movie4.setSubtitles("us-US");
        movie4.setDirector("Frédéric Meunier");
        movie4.setMinAge(16);
        movie4.setCity("Lyon");
        movie4.setStartAt("2018-01-17T05:45:03");
        movie4.setEndAt("2018-01-27T05:45:03");
        List<String> actors4 = new ArrayList<String>();
        actors4.add("Johny Hallyday");
        actors4.add("Serge Lama");
        actors4.add("Willy Wonka,");
        movie4.setMainActors(actors4);
        Session s10 = new Session("Monday", "18:00");
        Session s11 = new Session("Wednesdat", "10:00");
        Session s12 = new Session("Thursday", "20:00");
        List<Session> listSession4 = new ArrayList<Session>();
        listSession4.add(s10);
        listSession4.add(s11);
        listSession4.add(s12);
        movie4.setSessions(listSession4);
        movie4.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0NTczMTUzOV5BMl5BanBnXkFtZTYwMzIxNTg3._V1_SX300.jpg");


        Movie movie5 = new Movie();
        movie5.setId(4);
        movie5.setDuration(110);
        movie5.setTitle("Harry Potter Welcome to Poudlar");
        movie5.setLanguage("fr-FR");
        movie5.setSubtitles("us-US");
        movie5.setDirector("Alexandre Lounes");
        movie5.setMinAge(16);
        movie5.setCity("Lyon");
        movie5.setStartAt("2018-01-17T05:45:03");
        movie5.setEndAt("2018-01-27T05:45:03");
        List<String> actors5 = new ArrayList<String>();
        actors5.add("Johny Hallyday");
        actors5.add("Serge Lama");
        actors5.add("Willy Wonka,");
        movie5.setMainActors(actors5);
        Session s13 = new Session("Monday", "18:00");
        Session s14 = new Session("Wednesdat", "10:00");
        Session s15 = new Session("Thursday", "20:00");
        List<Session> listSession5 = new ArrayList<Session>();
        listSession5.add(s13);
        listSession5.add(s14);
        listSession5.add(s15);
        movie5.setSessions(listSession5);
        movie5.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0NTczMTUzOV5BMl5BanBnXkFtZTYwMzIxNTg3._V1_SX300.jpg");


        Movie movie6 = new Movie();
        movie6.setId(5);
        movie6.setDuration(180);
        movie6.setTitle("Harry Potter and the Order of the Phoenix");
        movie6.setLanguage("fr-FR");
        movie6.setSubtitles("fr-FR");
        movie6.setDirector("Alexandre Meunier");
        movie6.setMinAge(26);
        movie6.setCity("Marseille");
        movie6.setStartAt("2018-02-17T05:45:03");
        movie6.setEndAt("2018-02-27T05:45:03");
        List<String> actors6 = new ArrayList<String>();
        actors6.add("Youri Roure");
        actors6.add("Julien Carbonel");
        actors6.add("Thomas Karpua,");
        actors6.add("Guillaume Drelon,");
        movie6.setMainActors(actors5);
        Session s16 = new Session("Monday", "18:00");
        Session s17 = new Session("Wednesdat", "10:00");
        Session s18 = new Session("Thursday", "20:00");
        List<Session> listSession6 = new ArrayList<Session>();
        listSession6.add(s16);
        listSession6.add(s17);
        listSession6.add(s18);
        movie6.setSessions(listSession6);
        movie6.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0NTczMTUzOV5BMl5BanBnXkFtZTYwMzIxNTg3._V1_SX300.jpg");


        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        list.add(movie5);
        list.add(movie6);
    }

    private static moviesDatabase DB = new moviesDatabase();
    public static moviesDatabase getInstance(){return DB;}
    public List<Movie> getList(){return list;}

    //Methode pour ajouter un film
    public int addToList(Movie movieToAdd)
    {
        movieToAdd.setId(list.get(list.size()-1).getId()); //On génère l'ID via la taille de la liste
        list.add(movieToAdd);
        return movieToAdd.getId();
    }

    //Methode pour récupérer un film
    public Movie getMovie(int id){
        for (Movie m : list) //On parcout la liste des films
        {
            if(m.getId() == id){return m;} //Si c'est l'ID correspondant, on renvoit l'ID (m)
        }
        return null; // Si l'index n'existe pas, on ne retourne rien. Tous les films seront affichés
    }





}
