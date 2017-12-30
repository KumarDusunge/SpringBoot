package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.BasicDBObject;
import com.springboot.service.InsertService;

@Controller
public class ApplicationController {

	@Autowired
	InsertService insertService;
	
	@RequestMapping("login")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping("save")
	public String save(@RequestParam("value") String value){
		
		System.out.println(value);
		
		insertService.inserDocument(value);
		
		return "success";
	}
	
}
