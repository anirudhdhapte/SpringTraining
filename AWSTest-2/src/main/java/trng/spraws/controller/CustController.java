package trng.spraws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.spraws.dao.CustomerDAO;
import trng.spraws.model.CustomerBO;

@RestController
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustomerDAO cdao;

	@GetMapping("/")
	public List<CustomerBO> getemp() throws Exception {
		List<CustomerBO> listbo = cdao.getallcusts();
		return listbo;
	}
	
	  @PostMapping("/") public String putemp(@RequestBody CustomerBO ebo) throws Exception 
	  {
		  int n=cdao.putemps(ebo); 
		  if(n>0)
			  return "Row successfully inserted"; 
		  else
			  return "Row not inserted";
		  }
	 }
