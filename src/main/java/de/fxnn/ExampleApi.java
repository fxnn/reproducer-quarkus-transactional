package de.fxnn;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface ExampleApi {

  @GET
  @Path("/findAll")
  @Produces(MediaType.TEXT_PLAIN)
  String findAll();

  @POST
  @Path("/create")
  @Produces(MediaType.TEXT_PLAIN)
  String create(ExampleDto dto);
}
