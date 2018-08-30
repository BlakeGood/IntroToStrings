import java.util.Scanner;
public class challenges
	{

		public static void main(String[] args)
			{
				//challengeOne();
				challengeTwo();

			}
		
		public static void challengeOne()
		{
			Scanner shoutingWords = new Scanner(System.in);
			System.out.println("Please shout something using ALL CAPS!");
			String shouting = new String (shoutingWords.nextLine());
			shouting.toLowerCase();
			System.out.println(shouting.toLowerCase());
		}

		public static void challengeTwo()
		{
			System.out.println("Please type something");
			Scanner userInput = new Scanner(System.in);
			String input = userInput.nextLine();
			for (int i = 0; i <= input.length(); i++)
			{
				System.out.println(input.substring(i));
			}
			
			
		}
		
	}
