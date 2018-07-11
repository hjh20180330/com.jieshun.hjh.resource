package com.jieshun.hjh.com.jieshun.hjh.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Configuration
@Component
@ConfigurationProperties(prefix = "hjh")
public class ConfigRersource {
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("code:"+getCode()+",name:"+getName());
	}
}
