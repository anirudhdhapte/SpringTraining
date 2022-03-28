package trng.sprmservices.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trng.sprmservices.model.MovieInfo;

@RestController
public class HomeController {

	@RequestMapping("/")
	public List<MovieInfo> homepage() {
		List<MovieInfo> l=new ArrayList<MovieInfo>();
		l.add(new MovieInfo("Transformers","Robot Movie"));
		//l.add(new MovieInfo("Transformers 2","Another Robot Movie"));
		return l;
}
}
