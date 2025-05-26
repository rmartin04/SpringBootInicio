package es.cursospringboot.cursospringricky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CursoSpringRickyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringRickyApplication.class, args);
	}

}
