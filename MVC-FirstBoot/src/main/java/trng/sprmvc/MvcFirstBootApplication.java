package trng.sprmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class MvcFirstBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcFirstBootApplication.class, args);
	}
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver createCMPR() {
		CommonsMultipartResolver cmp=new CommonsMultipartResolver();
		return cmp;
	}
	
}
