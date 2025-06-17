package com.sai.app;

import com.sai.app.model.Laptop;
import com.sai.app.model.progammer;
import com.sai.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootFirstApplication.class, args);

		LaptopService service=context.getBean(LaptopService.class);

		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);


		/*progammer obj= context.getBean(progammer.class);
		System.out.println(obj.getAge());
		obj.code();  */
	}


}
