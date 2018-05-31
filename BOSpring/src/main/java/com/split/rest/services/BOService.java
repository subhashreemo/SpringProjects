package com.split.rest.services;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.split.rest.exceptions.BONotFound;
import com.split.rest.filters.StatusCode;
import com.split.rest.resources.BOResource;

@RestController
@Path("/getBO")
public interface BOService {
	
	@RequestMapping
    @Produces(APPLICATION_JSON)
    Collection<BOResource> getAll();
	
	/*@RequestMapping
    @Path("/{bo_id}")
    @Produces(APPLICATION_JSON)
    BOResource get(@PathParam(value = "bo_id") String id) throws BONotFound;*/
	
	/*@POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @StatusCode
    BOResource create(BOResource boressource);*/
}
