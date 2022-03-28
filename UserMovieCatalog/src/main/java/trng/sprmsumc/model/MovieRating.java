package trng.sprmsumc.model;

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
	this.MovieName = movieName;
	this.MovieRating = movieRating;
}
public MovieRating() {
}
}
