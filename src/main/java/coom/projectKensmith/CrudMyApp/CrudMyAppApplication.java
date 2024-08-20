package coom.projectKensmith.CrudMyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudMyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudMyAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
