package com.split.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.split.entity.BuyingCenterEntity;

@Repository
public interface BuyingOrderSplitRepository extends CrudRepository<BuyingCenterEntity, Long>{
	

}