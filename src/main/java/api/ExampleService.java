package api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces("application/json")
public interface ExampleService {

    @GET
    @Path("/{id}")
    ExampleModel get(@PathParam("id") String id);

}
