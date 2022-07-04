package com.example.proyectoii;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;

@Path("/translate")
public class HelloResource {
    /*@GET
    @Produces("text/plain")
    public String hello() {
        return "Hello2, World!";
    }*/

    HashMap<String, String> wordsList = new HashMap<String, String>();

    @GET
    //@Path("/traductor")
    @Produces("text/plain")
    public Response translate(@QueryParam("palabra") String palabra){
        wordsList.put("Amigo", "Friend");
        wordsList.put("Servidor", "Server");
        wordsList.put("Tigre", "Tiger");
        wordsList.put("Rojo", "Red");
        wordsList.put("Verde","Green");
        wordsList.put("Gato", "Cat");
        wordsList.put("Proyecto", "Project");
        wordsList.put("Sistemas Operativos", "Operating Systems");

        try{
            String word = wordsList.get(palabra);
            //String word = "kato";
            System.out.println(palabra);
            Response.ResponseBuilder response = Response.ok((String) word);
            return response.build();
        } catch (Exception ex){
            Response.ResponseBuilder response =  Response.noContent();
            return response.build();
        }
    }

}