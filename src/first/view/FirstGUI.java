package first.view;
import first.model.Friend;

import javax.swing.JOptionPane;

import first.model.Thingy;

public class FirstGUI
{
	private Thingy myGUIThingy;
	private Friend jordan = new Friend();
	private Friend palmer = new Friend();
	private Friend michael = new Friend();
	private Friend ben = new Friend();
	private Friend kamran = new Friend();
	private Friend manuel = new Friend();
	
	public FirstGUI()
	{
		myGUIThingy = new Thingy();
	
		
	}
	public void start()
	{
//		JOptionPane.showMessageDialog(null,"here we go!");
//		JOptionPane.showMessageDialog(null,"lets learn how to code");
//		JOptionPane.showMessageDialog(null,"i dont know how to code though?");
//		JOptionPane.showMessageDialog(null,"i will teach you young patawon");
//		JOptionPane.showMessageDialog(null,"ok master");
	
		meetTheThingyGUI();
		//findOutAboutFriends();
		//showAndTell();
	
	}
	
	private void findOutAboutFriends()
	{
		palmer.setName("palmer");
		palmer.setHumorStyle("clever");
		palmer.setWeight(150);
		palmer.setAge(18);
		palmer.setInterest("rockclimbing");
		palmer.setlikesPinapple(true);
		
		ben.setName("Ben");
		ben.setHumorStyle("sarcastic");
		ben.setWeight(135);
		ben.setAge(17);
		ben.setInterest("snowboarding");
		ben.setlikesPinapple(true);
		
		michael.setName("Michael");
		michael.setHumorStyle("funny ");
		michael.setWeight(150);
		michael.setAge(16);
		michael.setInterest("gaming");
		michael.setlikesPinapple(true);
		
		jordan.setName("Jordan");
		jordan.setHumorStyle("sadistic");
		jordan.setWeight(200);
		jordan.setAge(16);
		jordan.setInterest("games");
		jordan.setlikesPinapple(true);
		
		kamran.setName("Kamran");
		kamran.setHumorStyle("communist");
		kamran.setWeight(140);
		kamran.setAge(16);
		kamran.setInterest("computers");
		kamran.setlikesPinapple(true);
		
		manuel.setName("Manuel");
		manuel.setHumorStyle("dirty");
		manuel.setWeight(180);
		manuel.setAge(17);
		manuel.setInterest("pokemon");
		manuel.setlikesPinapple(false);
		
	}
	
	private void showAndTell()
	{
		JOptionPane.showMessageDialog(null,"Let me tell you about myself. " + " \n My name is " + palmer.getName() + " \n I like " + palmer.gethumorStyle() + " humor" + "\n I am " + palmer.getage() + " years old" + "\n I weigh "+ palmer.getweight() + " pounds" + "\n I am intrested in " + palmer.getinterest() + " \n I really like pinapple." );
		JOptionPane.showMessageDialog(null,"Let me tell you about my friend. " + " \n His name is " + ben.getName() + " \n He likes " + ben.gethumorStyle() + " humor" + "\n He is " + ben.getage() + " years old" + "\n He weighs "+ ben.getweight() + " pounds" + "\n He is intrested in " + ben.getinterest() + " \n He really likes pinapple." );
		JOptionPane.showMessageDialog(null,"Let me tell you about my friend. " + " \n His name is " + jordan.getName() + " \n He likes " + jordan.gethumorStyle() + " humor" + "\n He is " + jordan.getage() + " years old" + "\n He weighs "+ jordan.getweight() + " pounds" + "\n He is intrested in " + jordan.getinterest() + " \n He really likes pinapple." );
		JOptionPane.showMessageDialog(null,"Let me tell you about my friend. " + " \n His name is " + kamran.getName() + " \n He likes " + kamran.gethumorStyle() + " humor" + "\n He is " + kamran.getage() + " years old" + "\n He weighs "+ kamran.getweight() + " pounds" + "\n He is intrested in " + kamran.getinterest() + " \n He really likes pinapple." );
		JOptionPane.showMessageDialog(null,"Let me tell you about my friend. " + " \n His name is " + michael.getName() + " \n He likes " + michael.gethumorStyle() + " humor" + "\n He is " + michael.getage() + " years old" + "\n He weighs "+ michael.getweight() + " pounds" + "\n He is intrested in " + michael.getinterest() + " \n He really likes pinapple." );
		JOptionPane.showMessageDialog(null,"Let me tell you about my friend. " + " \n His name is " + manuel.getName() + " \n He likes " + manuel.gethumorStyle() + " humor" + "\n He is " + manuel.getage() + " years old" + "\n He weighs "+ manuel.getweight() + " pounds" + "\n He is intrested in " + manuel.getinterest() + " \n He really doesn't like pinapple." );
	}
	private void meetTheThingyGUI()
	{
		String newName = "";
		String answerFood = "";
		String StoryAnswer;
		StoryAnswer = JOptionPane.showInputDialog(null,"Type the name of a satirical short story we have read?");
				
		if(StoryAnswer.equalsIgnoreCase("Harrison Bergeron"))
		{
			String equalAnswer;
			JOptionPane.showMessageDialog( null, "You chose Harrison Bergeron by Kurt Vonnegut Jr.");
			JOptionPane.showMessageDialog( null, "This story is about a society that is completely uniform." + "\n Every citizen is bogged down by handicaps that limit their potential." + "\n Vonnegut Jr. is expoloring the pros and cons of a completely equal society.");
			equalAnswer = JOptionPane.showInputDialog( null, "Should our society be completely equal? Yes or no.");
			if(equalAnswer.equalsIgnoreCase("Yes"))
			{
				JOptionPane.showMessageDialog( null, "WOW! You are as bad as the handicap general.");
			}
			if(equalAnswer.equalsIgnoreCase("No"))
			{
				JOptionPane.showMessageDialog( null, "WOW! You think highly of yourself.");
			}
		}
		else if(StoryAnswer.equalsIgnoreCase("A Modest Proposal"))
		{
			String modestAnswer;
			JOptionPane.showMessageDialog( null, "You chose A Modest Proposal by Jonathan Swift.");
			JOptionPane.showMessageDialog( null, "This story is about an inteligent sugestion for the beggars of Ireland" + "\n Babies should be prepared for 1 year with breast milk then sold for food" + "\n This would stop the mass hunger and societal issues put upon Ireland.");
			modestAnswer = JOptionPane.showInputDialog( null, "Is Swift's proposal a good idea? Yes or no.");
			if(modestAnswer.equalsIgnoreCase("Yes"))
			{
				JOptionPane.showMessageDialog( null, "WOW! You want to eat babies! How terrible.");
			}
			if(modestAnswer.equalsIgnoreCase("No"))
			{
				JOptionPane.showMessageDialog( null, "WOW! You would let the poor go hungry and perish in the streets. How terrible.");
			}
		}
		
		
		 // JOptionPane.showMessageDialog( null, "My favorite food is " + answerFood);
		//  String answerMovie = JOptionPane.showInputDialog( null, "What is my favorite movie?");
		 // JOptionPane.showMessageDialog( null, "My favorite movie is " + answerMovie);
		 // JOptionPane.showMessageDialog( null, "You have created a new Thingy!");
		 // JOptionPane.showMessageDialog( null, "Its name is " + initialNameAnswer);
		 // JOptionPane.showMessageDialog( null, "Its favorite food is " + answerFood);
		 // JOptionPane.showMessageDialog( null, "Its favorite movie is " + answerMovie);
		  
		  
	}
	
	private void checkWrapper()
	
	{

		int age;
		JOptionPane.showMessageDialog( null, "Hi let's try somethingy new");
		String temp = JOptionPane.showInputDialog( null, "How old are you?");
		age = Integer.parseInt(temp);
		// parseInt means to read a counting number. from the String temp
		JOptionPane.showMessageDialog( null, "You are " + age + " years old. Next year you will be " + (age+1) + " years old!");
	}
	
	
//	private void meetTheThingy()
//	{
//		System.out.println("Here is a Thingy: " + testThingy.getName());
//		System.out.println("What do you want to change my name to?");
//		String newName = wordScanner.nextLine();
//		System.out.print("Are you really sure my name should be: " + newName);
//		System.out.println(" Yes or No");
//		
//		String answer = wordScanner.nextLine();
//		
//		if (answer.equalsIgnoreCase("Yes"))
//		{
//			System.out.println("I love my new name!");
//			//actions of if method.
//		}
//		else if (answer.equalsIgnoreCase("No"))
//		{
//			System.out.println("Then what should my name be?");
//		}
//		else
//		{
//			System.out.println("Stop typing gibberish");
//			meetTheThingy();
//		}
//	}
	
	
	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null,"Let's chat!");
		answer = JOptionPane.showInputDialog("What is your name?");
		//if i do not type a response null will be stored in my variable.
		JOptionPane.showMessageDialog(null,"Hi there " +answer);
	}
	
}
