package com.split.rest.controller;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.split.persistence.repositories.BORepository;
import com.split.rest.resources.BOResource;

@RestController
@CrossOrigin
@Path("/getBO")
public class BOController {

	@Autowired(required = true)
	private BORepository brepository;

	@RequestMapping(method =  RequestMethod.GET,value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<BOResource>> getAll() {
		/*Collection<BOResource> res = new ArrayList<>();
		for (BOEntity bentity : brepository.findAll()) {
			res.add(new BOResource(bentity));
		}
		return res;*/
		System.out.println("Inside controller");
		return new ResponseEntity<List<BOResource>>(Collections.EMPTY_LIST, HttpStatus.OK);			
	}

	/*
	 * public BOResource get(String bo_id) throws BONotFound { BOEntity bentity
	 * = brepository.findOne(Long.parseLong(bo_id)); if (bentity == null) {
	 * throw new BONotFound(bo_id); } return new BOResource(bentity); }
	 */
	/*
	 * public BOResource create(BOResource boresource) { BOEntity bentity =
	 * brepository.save(new BOEntity(boresource.getBO_ID(),
	 * boresource.getRegion(),boresource.getCluster(),boresource.getComponent(),
	 * boresource.getQuantity())); return new BOResource(bentity); }
	 */

	/*
	 * @RequestMapping
	 * 
	 * @Path("/{bo_id}")
	 * 
	 * @Produces(APPLICATION_JSON) BOResource get(@PathParam(value = "bo_id")
	 * String id) throws BONotFound;
	 */

	/*
	 * @POST
	 * 
	 * @Consumes(APPLICATION_JSON)
	 * 
	 * @Produces(APPLICATION_JSON)
	 * 
	 * @StatusCode BOResource create(BOResource boressource);
	 */
}
