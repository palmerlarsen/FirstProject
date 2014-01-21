package first.model;

public class Thingy

{
	//Declaration Section
	/**
	 * Thingy Story
	 */
	private String Story;
	
	/**
	 * Thingy favorite food
	 */
	private String food;
	
	/**
	 * Thingy favorite movie
	 */
	private String movie;

	private String name;
	
	public Thingy()
	{
		String name = "Harrison Bergeron" + "A Modest Proposal" ;
	   // food = "spicey hot tastiness";
	//	movie = "lots of action";		
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setFood(String food)
	{
		this.food = food;
	}
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	public String getName()
	{
		return name;
	}
	public String getFood()
	{
		return food;
	}
	public String getMovie()
	{
		return movie;
	}
}
