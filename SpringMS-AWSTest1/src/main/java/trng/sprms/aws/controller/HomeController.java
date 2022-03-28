package trng.sprms.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.sprms.aws.dao.EmployeeDAO;
import trng.sprms.aws.model.EmployeeBO;

@RestController
public class HomeController {

	@Autowired
	EmployeeDAO dao;
	
	@GetMapping("/emp")
	public List<EmployeeBO> getemp() throws Exception {
		List<EmployeeBO> l=dao.getemployees();
		return l;
	}
}
