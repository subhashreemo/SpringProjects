package com.split.rest.services;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.split.persistence.entities.BOEntity;
import com.split.persistence.repositories.BORepository;
import com.split.rest.exceptions.BONotFound;
import com.split.rest.resources.BOResource;

public class BOServiceImpl implements BOService{
	@Autowired(required = true)
	
	private BORepository brepository;
	
	 public void setRepository(BORepository brepository) {
	        this.brepository = brepository;
	    }
	
	 public Collection<BOResource> getAll() {
	        Collection<BOResource> res = new ArrayList<>();
	        for (BOEntity bentity : brepository.findAll()) {
	            res.add(new BOResource(bentity));
	        }
	        return res;
	    }
	 
	/* public BOResource get(String bo_id) throws BONotFound {
	        BOEntity bentity = brepository.findOne(Long.parseLong(bo_id));
	        if (bentity == null) {
	            throw new BONotFound(bo_id);
	        }
	        return new BOResource(bentity);
	    }*/
	 /*public BOResource create(BOResource boresource) {
	        BOEntity bentity = brepository.save(new BOEntity(boresource.getBO_ID(), boresource.getRegion(),boresource.getCluster(),boresource.getComponent(),boresource.getQuantity()));
	        return new BOResource(bentity);
	    }*/
}
