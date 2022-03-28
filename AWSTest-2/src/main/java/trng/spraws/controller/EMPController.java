package trng.spraws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.spraws.dao.EmployeeDAO;
import trng.spraws.model.EmployeeBO;

@RestController
@RequestMapping("/emp")
public class EMPController {
	
	@Autowired
	EmployeeDAO edao;

	@GetMapping("/")
	public List<EmployeeBO> getemp() throws Exception {
		List<EmployeeBO> listbo = edao.getallemps();
		return listbo;
	}
	@PostMapping("/")
	public String putemp(@RequestBody EmployeeBO ebo) throws Exception {
		int n=edao.putemps(ebo);
		if(n>0)
			return "Row successfully inserted";
		else
			return "Row not inserted";
	}

}
