package objects;

public class Movie {
	//encapsulation
	private String title;
	private String directedBy;
	private String boxOfficeReturn;
	private String country;
	private String runTime;
	private String director;



	//constructer methods
	public Movie (String title, String director, String boxOfficeReturn, String directedBy, String runTime) {
		this.title = title;
		this.directedBy = directedBy;
		this.boxOfficeReturn = boxOfficeReturn;
		this.runTime = runTime;
		this.director = director;
	}


	public Movie (String title, String director, String directedBy, String runTime) {
		this.title = title;
		this.director = director;
		this.directedBy = directedBy;
		this.runTime = runTime;

	}
		//getters and setters
		public String getTitle() {
			return title;
		}

	public void setTitle(String title) {
		// this. refers to the properties and methods of this class,
		// we use it to distinguish between the parameter coming into our setter and the class' property
		this.title = title;
	}
	public String getDirectedBy() {
		return directedBy;
	}
	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getBoxOfficeReturn() {
		return boxOfficeReturn;
	}
	public String setBoxOfficeReturn(String boxOfficeReturn) {
		return boxOfficeReturn;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getRunTime() {
		return runTime;
	}
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}
	@Override
	public String toString() {
		return title + "," + country + "," + directedBy + boxOfficeReturn + country + runTime;
	}

}
