package com.split.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.split.entity.BOItemEntity;
import com.split.repositories.BOItemRepository;
@Service
@Transactional(value="transactionManager")
public class BOItemService {

	@Autowired
	BOItemRepository boitemRepository;
	
	//get All BO Items
	
			public List<BOItemEntity> getAllBOItem(){
				Iterable<BOItemEntity> boItemEntities = boitemRepository.findAll();
				List<BOItemEntity> entities = new ArrayList<>();
				boItemEntities.forEach(entities::add);
				return entities;
			}
			
}
