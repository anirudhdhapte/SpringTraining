package trng.sprrest.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.sprrest.model.Customer;

@RestController
@RequestMapping("/message")
public class RestControl {

	@GetMapping("/generate")
	public ResponseEntity<String> generateMessage(){
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		String body=null;
		if(hour<12)
			body="Good Morning";
		else if(hour<16)
			body="Good Afternoon";
		else if(hour<20)
			body="Good Evening";
		else
			body="Good Night";
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<String> entity=new ResponseEntity<String>(body, status);
		return entity;
	}
	
	@GetMapping("testing")
	public ResponseEntity<Customer> getreq(){
		Customer cst=new Customer("ANI","Elina",100.00);
		return new ResponseEntity<Customer>(cst,HttpStatus.OK);
	}
	@PostMapping("testing")
	public String postreqbody(@RequestBody Customer cust){
		return cust.toString();	
	}
}
