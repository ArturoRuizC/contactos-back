package principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"controlador", "servicio", "dao"})
@EnableJpaRepositories(basePackages = {"interfaces"})
@EntityScan(basePackages = {"model"})
@SpringBootApplication
public class ContactosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactosApplication.class, args);
	}

}