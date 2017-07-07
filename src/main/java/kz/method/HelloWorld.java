
package kz.method;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by User on 07.07.2017.
 */
    @Path("/hello")
    public class HelloWorld {
        // The Java method will process HTTP GET requests
        @GET
        // The Java method will produce content identified by the MIME Media type "text/plain"
        @Produces(MediaType.TEXT_PLAIN)
        public String getClichedMessage() {
            // Return some cliched textual content
            return "Hello Nuris Bratan";
        }
    }

