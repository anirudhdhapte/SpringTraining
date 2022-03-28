package trng.sprmsumc.model;

public class UserMovieCatalog {

	private String UserName;
	private String MovieName;
	private String MovieInfo;
	private Integer MovieRating;
	public UserMovieCatalog(String userName, String movieName) {
		UserName = userName;
		MovieName = movieName;
	}
	public String getMovieInfo() {
		return MovieInfo;
	}
	public void setMovieInfo(String movieInfo) {
		MovieInfo = movieInfo;
	}
	public Integer getMovieRating() {
		return MovieRating;
	}
	public void setMovieRating(Integer integer) {
		MovieRating = integer;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
}
