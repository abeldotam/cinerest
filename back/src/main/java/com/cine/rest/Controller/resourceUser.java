package com.cine.rest.Controller;

//Import des packagages pour le chiffrement du token
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/login")
@Consumes(APPLICATION_JSON) //Reçoit un Json
@Produces(MediaType.TEXT_PLAIN) //Va renvoyer un texte plein (token)

public class resourceUser {
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED) //Reçoit un Json

    //Methode d'authenficiation (un seul login hardcodé pour les besoins du projet)
    public String loginUser(@FormParam("login") String login, @FormParam("password") String password)
    {
        if (login.equals("Martin") && password.equals("Abel"))
        {
            try {return genToken(login);} catch (Exception e) {return "Error during login";} // Renvoie du token ou Erreur
        }
        else
        {
            return null;
        }

    }
    private String genToken(String login) {
        try {
            Algorithm cryptAlgo = Algorithm.HMAC256("passphrasechiffrement");
            String token = JWT.create().withIssuer("auth0").sign(cryptAlgo);
            return token;
        } catch (UnsupportedEncodingException exception){ //Problème d'encodage
        } catch (JWTCreationException exception){ //Problème de connexion
        }
        return null ;
    }
}