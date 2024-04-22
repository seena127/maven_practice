package com.javaexpress.docker.docker.javaspringboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Requestmapping("/v1/docker")

Public class Dockerhelloworld{

	@GetMapping
	public String getName(){
		return "Welcome to java application";
	}


}