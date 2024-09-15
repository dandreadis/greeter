package demo.greeter;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreeterAiService greeter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeter.greet(1, "Dimitris");
    }

    @GET
    @Path("name")
    public String name() {
        return greeter.name(1);
    }

    @GET
    @Path("time")
    public String time() {
        return greeter.time();
    }
}
