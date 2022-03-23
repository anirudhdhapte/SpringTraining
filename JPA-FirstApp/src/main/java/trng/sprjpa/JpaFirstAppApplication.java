package trng.sprjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaFirstAppApplication.class, args);
		System.out.println("Checking");
	}

}
