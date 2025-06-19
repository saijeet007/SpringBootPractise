package com.sai.app;

<<<<<<< HEAD
import com.sai.app.model.Laptop;
import com.sai.app.model.progammer;
import com.sai.app.service.LaptopService;
=======
>>>>>>> 3771cf3a49f75678122cc1eec4908be9b8aace37
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext context =SpringApplication.run(SpringBootFirstApplication.class, args);

		LaptopService service=context.getBean(LaptopService.class);

		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);


		/*progammer obj= context.getBean(progammer.class);
		System.out.println(obj.getAge());
		obj.code();  */
=======

		ApplicationContext context =SpringApplication.run(SpringBootFirstApplication.class, args);
		progammer obj= context.getBean(progammer.class);
		System.out.println(obj.getAge());
		obj.code();
>>>>>>> 3771cf3a49f75678122cc1eec4908be9b8aace37
	}


}
