package trng.sprmservices.model;

public class MovieInfo {
private String MovieName;
private String MovieInfo;
public String getMovieName() {
	return MovieName;
}
public void setMovieName(String movieName) {
	MovieName = movieName;
}
public String getMovieInfo() {
	return MovieInfo;
}
public void setMovieInfo(String movieInfo) {
	MovieInfo = movieInfo;
}
public MovieInfo(String movieName, String movieInfo) {
	this.MovieName = movieName;
	this.MovieInfo = movieInfo;
}
public MovieInfo() {
}
}
