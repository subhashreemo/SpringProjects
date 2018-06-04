package com.split.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.split.beans.BOHeaderBean;
import com.split.beans.BOItemBean;
import com.split.entity.BOHeaderEntity;
import com.split.service.BOService;

@RestController
@RequestMapping("/BOService")
public class BOController {
	/*	http://localhost:8181/restapplication/rest/BOService/list
		http://localhost:8181/restapplication/rest/BOService/create*/
	@Autowired
	BOService boService;
	
	@RequestMapping(method =  RequestMethod.GET,value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<BOHeaderBean>> getAll() {
		List<BOHeaderEntity> boEntities = boService.getAllBO();
		List<BOHeaderBean> boBeans = new ArrayList<>(boEntities.size());
		boEntities.forEach(b -> {
			boBeans.add(new BOHeaderBean(b));
		});
		return new ResponseEntity<List<BOHeaderBean>>(boBeans, HttpStatus.OK);			
	}
	
	@RequestMapping(method =  RequestMethod.POST,value="/create", consumes= MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> createBO(@RequestBody BOHeaderBean bean) {
		System.out.println("createBO request data");
		boService.saveBean(bean);
		return new ResponseEntity<String>("BO Created Successfully", HttpStatus.OK);			
	}
}
