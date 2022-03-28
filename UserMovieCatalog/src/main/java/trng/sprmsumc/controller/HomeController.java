package trng.sprmsumc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import trng.sprmsumc.model.MovieInfo;
import trng.sprmsumc.model.MovieRating;
import trng.sprmsumc.model.UserMovieCatalog;

@RestController
public class HomeController {

	@RequestMapping("/")
	public List<UserMovieCatalog> homepage() {
		RestTemplate restTemp=new RestTemplate();
		List<UserMovieCatalog> l=new ArrayList<UserMovieCatalog>();
		l.add(new UserMovieCatalog("Ani","Transformers"));
		//l.add(new UserMovieCatalog("Ani2","Transformers 2"));
		/*
		 * WebClient.Builder builder=WebClient.builder(); MovieInfo
		 * movieinfo=builder.build() .get() .uri("http://localhost:8081/") .retrieve()
		 * .bodyToMono(MovieInfo.class) .block();
		 */
		MovieInfo[] movieinfo=restTemp.getForObject("http://localhost:8081/",MovieInfo[].class);
		l.get(0).setMovieInfo(movieinfo[0].getMovieInfo());
		//System.out.println(movieinfo[0].getMovieInfo());
		MovieRating[] movierating=restTemp.getForObject("http://localhost:8082/",MovieRating[].class);
		l.get(0).setMovieRating(movierating[0].getMovieRating());
		return l;
}
}