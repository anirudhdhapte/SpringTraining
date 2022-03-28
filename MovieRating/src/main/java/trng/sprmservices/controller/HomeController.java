package trng.sprmservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.sprmservices.model.MovieRating;

@RestController
public class HomeController {

	@RequestMapping("/")
	public List<MovieRating> homepage() {
		List<MovieRating> l=new ArrayList<MovieRating>();
		l.add(new MovieRating("Transformers",5));
		l.add(new MovieRating("Transformers 2",5));
		return l;
}
}