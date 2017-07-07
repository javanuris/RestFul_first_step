package kz.method;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by User on 07.07.2017.
 */

@Path("/message")
public class MessageResource {
   @GET
   @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(){
        return "Nurislam";
    }
}
