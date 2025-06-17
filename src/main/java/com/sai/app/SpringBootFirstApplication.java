package com.sai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringBootFirstApplication.class, args);
		progammer obj= context.getBean(progammer.class);
		System.out.println(obj.getAge());
		obj.code();
	}


}
