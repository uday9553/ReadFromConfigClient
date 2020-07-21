package com.uday.ReadFromConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ClientController {

	@Value("${application.message}")
    private String property;
	
	@RequestMapping(name = "/getConfig")
	public String printConfig(){
		StringBuilder builder=new StringBuilder();		
		builder.append(" || ");
		builder.append(property);
		return  builder.toString();
	}
	
	
}
