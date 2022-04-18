package dev.amf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class config {
    @ConfigProperty(name = "pw2",  defaultValue="" )
    String pw2;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return pw2 + "from RESTEasy Reactive";
    }
}