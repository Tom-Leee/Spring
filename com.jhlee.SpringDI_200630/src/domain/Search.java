package domain;

public class Search {
	private String moviecode;
	private String movietitle;                
	private String movieplot;              	  
	private String movieruntime;             
	private String movieproductyear;          
	private String moviescreeninginformation; 
	private String movierating;              
	private String movieaudiencescount;       
	private String movieproductionagency;  
	private String moviedistributoragency;    
	private String movieinvestmentcompany;   
	private String movietrailer;
	
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Search(String moviecode, String movietitle, String movieplot, String movieruntime, String movieproductyear,
			String moviescreeninginformation, String movierating, String movieaudiencescount,
			String movieproductionagency, String moviedistributoragency, String movieinvestmentcompany,
			String movietrailer) {
		super();
		this.moviecode = moviecode;
		this.movietitle = movietitle;
		this.movieplot = movieplot;
		this.movieruntime = movieruntime;
		this.movieproductyear = movieproductyear;
		this.moviescreeninginformation = moviescreeninginformation;
		this.movierating = movierating;
		this.movieaudiencescount = movieaudiencescount;
		this.movieproductionagency = movieproductionagency;
		this.moviedistributoragency = moviedistributoragency;
		this.movieinvestmentcompany = movieinvestmentcompany;
		this.movietrailer = movietrailer;
	}
	
	public String getMoviecode() {
		return moviecode;
	}
	public void setMoviecode(String moviecode) {
		this.moviecode = moviecode;
	}
	public String getMovietitle() {
		return movietitle;
	}
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	public String getMovieplot() {
		return movieplot;
	}
	public void setMovieplot(String movieplot) {
		this.movieplot = movieplot;
	}
	public String getMovieruntime() {
		return movieruntime;
	}
	public void setMovieruntime(String movieruntime) {
		this.movieruntime = movieruntime;
	}
	public String getMovieproductyear() {
		return movieproductyear;
	}
	public void setMovieproductyear(String movieproductyear) {
		this.movieproductyear = movieproductyear;
	}
	public String getMoviescreeninginformation() {
		return moviescreeninginformation;
	}
	public void setMoviescreeninginformation(String moviescreeninginformation) {
		this.moviescreeninginformation = moviescreeninginformation;
	}
	public String getMovierating() {
		return movierating;
	}
	public void setMovierating(String movierating) {
		this.movierating = movierating;
	}
	public String getMovieaudiencescount() {
		return movieaudiencescount;
	}
	public void setMovieaudiencescount(String movieaudiencescount) {
		this.movieaudiencescount = movieaudiencescount;
	}
	public String getMovieproductionagency() {
		return movieproductionagency;
	}
	public void setMovieproductionagency(String movieproductionagency) {
		this.movieproductionagency = movieproductionagency;
	}
	public String getMoviedistributoragency() {
		return moviedistributoragency;
	}
	public void setMoviedistributoragency(String moviedistributoragency) {
		this.moviedistributoragency = moviedistributoragency;
	}
	public String getMovieinvestmentcompany() {
		return movieinvestmentcompany;
	}
	public void setMovieinvestmentcompany(String movieinvestmentcompany) {
		this.movieinvestmentcompany = movieinvestmentcompany;
	}
	public String getMovietrailer() {
		return movietrailer;
	}
	public void setMovietrailer(String movietrailer) {
		this.movietrailer = movietrailer;
	}
	
	@Override
	public String toString() {
		return "Search [moviecode=" + moviecode + ", movietitle=" + movietitle + ", movieplot=" + movieplot
				+ ", movieruntime=" + movieruntime + ", movieproductyear=" + movieproductyear
				+ ", moviescreeninginformation=" + moviescreeninginformation + ", movierating=" + movierating
				+ ", movieaudiencescount=" + movieaudiencescount + ", movieproductionagency=" + movieproductionagency
				+ ", moviedistributoragency=" + moviedistributoragency + ", movieinvestmentcompany="
				+ movieinvestmentcompany + ", movietrailer=" + movietrailer + "]";
	}
}
