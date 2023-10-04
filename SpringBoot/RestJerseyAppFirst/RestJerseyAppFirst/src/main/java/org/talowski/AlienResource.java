package org.talowski;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Path("aliens")
public class AlienResource {

    AlienRepo repo = new AlienRepo();
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    /*@Produces(MediaType.APPLICATION_JSON)*/
    public List<Alien> getAliens(){
        System.out.println("aliens get called");

        return repo.getAliens();
    }
    @GET
    @Path("alien/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    /*@Produces(MediaType.APPLICATION_JSON)*/
    public Alien getAlien(@PathParam("id") int id) {
        System.out.println("alien get called");
        return repo.getAlien(id);
    }
    @POST
    /*@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })*/ //i don't know if it is working, it sets POST to XML i guess
    @Path("alien")
    public Alien createAlien(Alien a){
        System.out.println(a);
        repo.create(a);

        return a;
    }
    @PUT
    /*@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })*/ //i don't know if it is working, it sets POST to XML i guess
    @Path("alien")
    public Alien updateAlien(Alien a){
        System.out.println(a);
        if(repo.getAlien(a.getId()).getId()==0){
            repo.create(a);
        }
        else {
            repo.update(a);
        }
        return a;
    }
    @DELETE
    @Path("alien/{id}")
    public Alien deleteAlien(@PathParam("id") int id){
        Alien a = repo.getAlien(id);
        if(a.getId()!=0)
            repo.delete(id);

        return a;
    }
}
