package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Theatre {
	
	@Autowired
	private Viewer vv;
	
	public void watch ()
	{
		
		vv.payAndWatch();
		System.out.println("Watching movies");
	
	}
}
