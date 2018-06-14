package com.split.repositories;

import org.springframework.data.repository.CrudRepository;

import com.split.entity.BOItemEntity;
import com.split.entity.WeeklySplitUpdateEntity;

public interface WeeklySplitUpdateRepository extends CrudRepository<WeeklySplitUpdateEntity, Long> {

}
