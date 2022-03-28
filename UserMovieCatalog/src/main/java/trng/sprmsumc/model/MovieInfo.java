package trng.sprmsumc.model;

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
	MovieName = movieName;
	MovieInfo = movieInfo;
}
public MovieInfo() {
}
}
