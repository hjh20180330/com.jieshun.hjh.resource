package com.jieshun.hjh.com.jieshun.hjh.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
	private static ConfigRersource cr ;
	
    public static void main( String[] args )
    {	
    	SpringApplication.run(App.class, args);
    	cr.display();
    }
    
    @Autowired 
    public void setConfigRersource(ConfigRersource rRJConfig) {
    	this.cr = rRJConfig;
    }
}
