package com.test.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class swimCoach implements Coach{
	FortunateServices fs;
		
	public swimCoach() {
		System.out.println("empty constructor");
	}
	
	@Override
	public String doWorkOut() {
		return "Swim 100m";
	}
	
	public String doLucky() {
		return fs.doLucky();
	}
	
	@Autowired
	public void setFortunateServices(FortunateServices fs) {
		this.fs = fs;
	}
}
