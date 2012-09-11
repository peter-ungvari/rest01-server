package org.jupi.teaching;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
@Consumes("text/plain")
public class HelloWorld {
    
    @GET
    public String greet(@DefaultValue("world!") @QueryParam("who") String who) {
        return "Hello " + who;
    }
    
    @GET
    @Path("/{user}")
    public String greetUser(@PathParam("user") String user) {
        return "Hello " + user;
    }
    
    @POST
    @Path("/post-user")
    public String greetUser2(String user) {
         return "Hello " + user;
    }
    
    @POST
    //@Consumes("application/x-www-form-urlencoded")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/post-form")
    public String greetUser3(@FormParam("who") String user) {
         return "Hello " + user;
    }
    
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String greetHtml() {
        return "<!DOCTYPE HTML><html><head><title>hello</title><body>Hello world!</body></html>";
    }
    
}
