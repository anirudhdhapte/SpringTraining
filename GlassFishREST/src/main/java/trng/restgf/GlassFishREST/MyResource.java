package trng.restgf.GlassFishREST;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import trng.restgf.model.Employees;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/home")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employees> getIt() {
        List<Employees> l=new ArrayList<Employees>();
        l.add(new Employees(5523, "ANI"));
        l.add(new Employees(5524, "ANI2"));
    	return l;
    }
}
