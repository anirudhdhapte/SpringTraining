package trng.sprrest.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import trng.sprrest.model.Customer;

@RestController
@RequestMapping("/api1")
public class RestControl {

	@GetMapping("testing")
	public ResponseEntity<String> getreq(){
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> cst=rt.getForEntity("http://localhost:9000/message/generate",String.class);
		return cst;
	}
	@PostMapping("testing")
	public String postreqbody(@RequestBody Customer cust){
		return cust.toString();	
	}
}
