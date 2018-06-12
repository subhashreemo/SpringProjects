package com.split.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.split.entity.WeeklySplitEntity;
import com.split.repositories.WeeklySplitRepository;
@Service
@Transactional(value="transactionManager")

public class WeeklySplitService {
	@Autowired
	WeeklySplitRepository weeklysplitrepository;
	// Get Week Split
	public List<WeeklySplitEntity> getWeekSplit(){
		Iterable<WeeklySplitEntity> boWeekSplit = weeklysplitrepository.findAll();
		List<WeeklySplitEntity> entities = new ArrayList<>();
		boWeekSplit.forEach(entities::add);
		return entities;
	}

}
