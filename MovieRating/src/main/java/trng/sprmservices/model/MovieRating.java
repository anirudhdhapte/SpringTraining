package trng.sprmservices.model;

public class MovieRating {
private String MovieName;
private Integer MovieRating;
public String getMovieName() {
	return MovieName;
}
public void setMovieName(String movieName) {
	MovieName = movieName;
}
public Integer getMovieRating() {
	return MovieRating;
}
public void setMovieRating(Integer movieRating) {
	MovieRating = movieRating;
}
public MovieRating(String movieName, Integer movieRating) {
	super();
	MovieName = movieName;
	MovieRating = movieRating;
}
}
