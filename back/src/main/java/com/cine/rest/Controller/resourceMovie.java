package com.cine.rest.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.cine.rest.Modal.Movie;

//Affichage de tous les films
@Path("/movies")
public class resourceMovie {
    private moviesDatabase db = moviesDatabase.getInstance();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON) //Génère un Json
    public List<Movie> getMovies(@QueryParam("city") String city) //On récupère le paramètre "?city=paris"
    {
        if(city == null)
        {
            return db.getList(); //S'il n'y a pas de ville, on renvoie tous les films
        }
        else
        {
            List<Movie> result = new ArrayList<Movie>();
            for(Movie m : db.getList())
            {
                if(m.getCity().equalsIgnoreCase(city)){result.add(m);}
            }
            return result;
        }
    }

    // On récupére l'ID du film
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMovieInfo(@PathParam("id") int id){return db.getMovie(id);}

    //Envoie d'un film
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON) //Récupère un JSon
    @Produces(MediaType.APPLICATION_JSON) //Envoie un Json
    public int postMovie(Movie movie){
        movie.setId(db.getList().size());
        db.getList().add(movie);
        return movie.getId();
    }
}
