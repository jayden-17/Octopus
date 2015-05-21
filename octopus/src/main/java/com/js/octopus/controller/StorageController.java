package com.js.octopus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.octopus.entity.StorageEntity;
import com.js.octopus.service.StorageService;

@Controller
@RequestMapping("/storage")
public class StorageController {
	
	@Autowired 
	private StorageService storageService;
	
	@RequestMapping(method=RequestMethod.GET)
	 public @ResponseBody List<StorageEntity> getAllSystemStatus() {
		 return storageService.findAll();
	 }
	 @RequestMapping(value="/{id}",method=RequestMethod.GET)
	 public @ResponseBody StorageEntity getSystemStatus(@PathVariable Long id) {
		 return storageService.findOne(id);
	 }
}
