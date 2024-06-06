package net.utopios;


import java.util.List;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import net.utopios.service.DataService;
import org.jboss.logging.annotations.Pos;

@Path("api/v1/data")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemoResource {

    //@Inject
    private final DataService dataService;

    public DemoResource(DataService dataService) {
        this.dataService = dataService;
    }

    @GET
    public List<String> get() {
        return dataService.getData();
    }


    @POST
    public Object post(Object data) {
        return data;
    }
}
