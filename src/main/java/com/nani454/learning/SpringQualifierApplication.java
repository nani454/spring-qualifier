package com.nani454.learning;

import com.nani454.learning.main.AppMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringQualifierApplication {
	@Autowired
	AppMain appMain;

	public static void main(String[] args) {
		SpringApplication.run(SpringQualifierApplication.class, args);
	}
	@PostConstruct
	public void init(){
		appMain.runSimulation();
	}

}
