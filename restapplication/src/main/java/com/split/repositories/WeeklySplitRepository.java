package com.split.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.split.entity.WeeklySplitEntity;

@Repository
public interface WeeklySplitRepository extends CrudRepository<WeeklySplitEntity, Long>{
	

}
