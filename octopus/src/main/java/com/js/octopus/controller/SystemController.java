package com.js.octopus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.octopus.entity.SystemEntity;
import com.js.octopus.service.SystemService;

@Controller
@RequestMapping("/system")
public class SystemController {

	 @Autowired 
	 private SystemService systemService;
	 
	 @RequestMapping(method=RequestMethod.GET)
	 public @ResponseBody List<SystemEntity> getAllSystemStatus() {
		 return systemService.findAll();
	 }
	 @RequestMapping(value="/{id}",method=RequestMethod.GET)
	 public @ResponseBody SystemEntity getSystemStatus(@PathVariable Long id) {
		 return systemService.findOne(id);
	 }
	 
	 @RequestMapping(value="/hostIp/{hostIp}",method=RequestMethod.GET)
	 public @ResponseBody List<SystemEntity> getSystemStatus(@PathVariable String hostIp) {
		 return systemService.findByHostIp(hostIp);
	 }
	 
	 @RequestMapping(method=RequestMethod.POST)
	 public void insertSystemStatus(SystemEntity systemEntity) {
	 }

}
