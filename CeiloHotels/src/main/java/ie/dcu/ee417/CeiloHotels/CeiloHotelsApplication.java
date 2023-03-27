package ie.dcu.ee417.CeiloHotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ie.dcu.ee417.CeiloHotels.entities.Feedback;
import ie.dcu.ee417.CeiloHotels.entities.Users;

@ComponentScan(basePackages = "ie.dcu.ee417.CeiloHotels.*")
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "ie.dcu.ee417.CeiloHotels.repository" })
@EntityScan(basePackageClasses = {Feedback.class, Users.class})
public class CeiloHotelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CeiloHotelsApplication.class, args);
	}

}
