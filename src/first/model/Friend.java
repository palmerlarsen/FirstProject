package first.model;

public class Friend
{
	private String name;
	private String humorStyle;
	private double weight;
	private int age;
	private String interest;
	private boolean likesPinapple;
	
	public void setName(String name)
	{
		this.name = name;				
	}
	
	public void setHumorStyle(String humorStyle)
	{
		this.humorStyle = humorStyle;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setInterest(String interest)
	{
		this.interest = interest;
	}
	
	public void setlikesPinapple(boolean likesPinapple)
	{
		this.likesPinapple = likesPinapple;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String gethumorStyle()
	{
		return humorStyle;
	}
	
	public double getweight()
	{
		return weight;
	}
	
	public int getage()
	{
		return age;
	}
	
	public String getinterest()
	{
		return interest;
	}
	
	public boolean getlikesPinapple()
	{
		return likesPinapple;
	}
	
	public Friend(String name, String humorStyle, double weight, int age, String interest, boolean likesPinapple) 
	{
		setName(name);
		setHumorStyle(humorStyle);
		setAge(age);
		setWeight(weight);
		setInterest(interest);
		setlikesPinapple(likesPinapple);		
				
	}
	
	public Friend()
	{
		name = "nameless";
		humorStyle = "absolutely zero";
		weight =-250.5;
		age =-34;
		interest = "nothing";
		likesPinapple = false;
	}
}

