package trng.sprms.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/home")
	public String homepage() {
		return "Before test Commit";
	}
}
