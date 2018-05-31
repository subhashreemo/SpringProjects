package com.split.persistence.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.split.persistence.entities.BOEntity;
@Transactional
@Repository
public interface BORepository extends CrudRepository<BOEntity, Long>{
	

}
