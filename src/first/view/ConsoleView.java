package first.view;

import first.model.Thingy;
import java.util.Scanner;

public class ConsoleView
{
	// Declare a Scanner object to use in the console.
	
	private Scanner wordScanner;
	
	
	//Declare a Thingy object for testing purposes.
	
	private Thingy testThingy;
	
	private Boolean caps = false;
	
	
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}
	
	private Boolean checkForCaps(String s)
	{
		if (s.startsWith("a")|| s.startsWith("b")|| s.startsWith("c")|| s.startsWith("d")|| s.startsWith("e")|| s.startsWith("f")|| s.startsWith("g")|| s.startsWith("h")|| s.startsWith("i")|| s.startsWith("j")|| s.startsWith("k")|| s.startsWith("l")|| s.startsWith("m")|| s.startsWith("n")|| s.startsWith("o")|| s.startsWith("p")|| s.startsWith("q")|| s.startsWith("r")|| s.startsWith("s")|| s.startsWith("t")|| s.startsWith("u")|| s.startsWith("v")|| s.startsWith("w")|| s.startsWith("x")|| s.startsWith("y")|| s.startsWith("z"))
			return caps = true;
		
		return caps = false;
			
	}
	private void reallyMeetTheThingy()
	{
		System.out.println("Hello my name is " + testThingy.getName());
		System.out.println("What is your name?");
		String nameAnswer = wordScanner.nextLine();
		checkForCaps(nameAnswer);
		if (caps == true)
		{
			System.out.println("You really should capitalize your first name!:)");
			System.out.println("What is your name?");
			String name1Answer = wordScanner.nextLine();
		}
		System.out.println("Nice to meet you! What is your favorite food?");
		String userFavoriteFood = wordScanner.nextLine();
		System.out.println (userFavoriteFood + " is delicious! I like " + testThingy.getFood());
		System.out.println("Do you?");
		String likeSpiceyFoodAnswer = wordScanner.nextLine();
		if (likeSpiceyFoodAnswer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Then you must like Thai Food!");
		}
			
		else if (likeSpiceyFoodAnswer.equalsIgnoreCase("No"))
		{	
			System.out.println("Then you must not like Thai food :(");
		}
	
	}
	private void meetTheThingy()
	{
		System.out.println("Here is a Thingy: " + testThingy.getName());
		System.out.println("What do you want to change my name to?");
		String newName = wordScanner.nextLine();
		System.out.print("Are you really sure my name should be: " + newName);
		System.out.println(" Yes or No");
		
		String answer = wordScanner.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("I love my new name!");
			//actions of if method.
		}
		else if (answer.equalsIgnoreCase("No"))
		{
			System.out.println("Then what should my name be?");
		}
		else
		{
			System.out.println("Stop typing gibberish");
			meetTheThingy();
		}
	}
	public void start()
	{
//		System.out.println("Hi there, lets talk!");
//		getWords();	
//		getWords();	
		reallyMeetTheThingy();
	}
	
	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("you typed this to me: ");
		System.out.println(test);
	}
	/**
	 * ask the user 4 questions. Print their answers
	 */
	public void questionAndAnswers()
	{
		System.out.println("What is your name?");
		getWords();	
		System.out.println("My name is computerman. Do you like computers?");
		getWords();	
		System.out.println("I bet you like Windows better than Macs?");
		getWords();	
		System.out.println("Everyone does! How old are you?");
		getWords();	
	}
	private void show()
	{
		System.out.println ("this on my screen"); 
	    System.out.println("i am learning how to code");
		System.out.println("this is kind of confusing");
	

		Thingy testThing= new Thingy();
		testThing.setName("Palmer's Thingy");
		System.out.print("My test thingy name is :");
		System.out.print(testThing.getName());
	}

}
